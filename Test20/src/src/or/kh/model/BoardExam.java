package src.or.kh.model;

import java.util.ArrayList;
import java.util.List;

import section.Board;

public class BoardExam {
	public static void main(String[] args) {
		List<Board> boardList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Board board = new Board(i,"wpahr"+i,"sodyd"+i,"writer"+i,"2024-03", 0);
			boardList.add(board);
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(boardList.get(i));
		}
	}
}
