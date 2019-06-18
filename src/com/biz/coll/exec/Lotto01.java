package com.biz.coll.exec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Lotto01 {

	public static void main(String[] args) {

		List<Integer> lottos = new ArrayList<Integer>();

		// 정수형 List에 1~45까지의 숫자를 추가
		for (int i = 0; i < 45; i++) {
			lottos.add(i + 1);
		}

		// List를 45번 흔들기(뒤섞기)
		int lSize = lottos.size();
		for (int i = 0; i < lSize; i++) {
			Collections.shuffle(lottos);
		}

		// List에서 0번부터 5번까지 값을 읽어서
		// Set(TreeSet)에 담기
		// 자동으로 정렬
		Set<Integer> lottoSet = new TreeSet<Integer>();
		for (int i = 0; i < 6; i++) {
			lottoSet.add(lottos.get(i));
		}

		// Set자료구조에 선언되어있는 toString()메서드를 호출하여
		// 자료List를 콘솔에 보이기
		System.out.println(lottoSet);

	}

}
