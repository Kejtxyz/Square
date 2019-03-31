package pl.sdacademy.tarr.exam.ex1;

public class Pattern {

	public String prepareSquareWithDiagonals(char sign, int size) {
		String pattern = "";
		// pętla iterująca po wierszach
		for(int i = 0; i < size; i++){
			// pętle iterująca po komórkach
			for(int j = 0; j < size; j++){
				if(i == 0 || i == size -1) {
					if (j != size - 1) {
						pattern = pattern + sign + " ";
					} else {
						pattern = pattern + sign + "\n";
					}
				} else if(i != 0){
					if(j == 0 && i != size -1){
						pattern = pattern + sign + " ";
					} else if (i == j || i == size - j -1){
						pattern = pattern + sign + " ";
					} else if (j == 0 && i == size -1 || j == size -1){
						pattern = pattern + sign + "\n";
					} else {
						pattern = pattern + "  ";
					}
				}
			}
		}
		System.out.println(pattern);
		return pattern;
	}

	public static void main(String[] args) {
		new Pattern().prepareSquareWithDiagonals('#',7);
	}
}