package com.sorting.consumer;

import java.util.List;
import java.util.logging.Logger;

import com.sorting.algorithm.BubbleSort;

/* 다른 project 쓰는법
 1. 프로젝트 설정(properties)
 2. Java Build path
 3. projects
 4. class path -> add
 5. 사용하고 싶은 project select
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
