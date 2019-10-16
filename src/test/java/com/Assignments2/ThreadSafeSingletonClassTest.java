package com.Assignments2;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;

public class ThreadSafeSingletonClassTest {
	@Ignore
	@Test
	public void shouldNotCreateMoreThanOneObjectForSingletonClass() {

		ThreadSafeSingletonClass ts1 = ThreadSafeSingletonClass.getInstance();
		ThreadSafeSingletonClass ts2 = ThreadSafeSingletonClass.getInstance();
		assertEquals(ts1.hashCode(), ts2.hashCode());
	}

	@Test
	public void checkThreadUnSafeSingleton() throws InterruptedException {
		int threadsAmount = 500;
		Set<ThreadSafeSingletonClass> singletonSet = Collections.newSetFromMap(new ConcurrentHashMap<>());

		ExecutorService executorService = Executors.newFixedThreadPool(threadsAmount);

		for (int i = 0; i < threadsAmount; i++) {
			executorService.execute(() -> {
				ThreadSafeSingletonClass singleton = ThreadSafeSingletonClass.getInstance();
				singletonSet.add(singleton);
			});
		}

		executorService.shutdown();
		executorService.awaitTermination(1, TimeUnit.MINUTES);

		Assert.assertEquals(1, singletonSet.size());
	}

	@Test
	public void shouldReturnSameSerialIDForTwoObjectAsSerializationSafe()
			throws FileNotFoundException, IOException, ClassNotFoundException {

		ThreadSafeSingletonClass ts1 = ThreadSafeSingletonClass.getInstance();
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file1.ser"));
		out.writeObject(ts1);
		out.close();
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("file1.ser"));
		ThreadSafeSingletonClass readObject = (ThreadSafeSingletonClass) in.readObject();
		assertEquals(ts1, readObject);
	}
}
