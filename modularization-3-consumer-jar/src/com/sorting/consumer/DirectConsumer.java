package com.sorting.consumer;

import java.util.List;
import java.util.logging.Logger;

import com.sorting.algorithm.BubbleSort;

/* �ٸ� project ���¹�
 1. ������Ʈ ����(properties)
 2. Java Build path
 3. projects
 4. class path -> add
 5. ����ϰ� ���� project select
 6. apply and close
*/
public class DirectConsumer {

	private static Logger logger = Logger.getLogger(DirectConsumer.class.getName());

	public static void main(String[] args) {
		BubbleSort util = new BubbleSort();
		List<String> sorted = util.sort(List.of("Ranga", "Ravi", "Sathis", "Adam", "Eve"));

		logger.info(sorted.toString());

	}
}
