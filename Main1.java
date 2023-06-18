//******Задача про вкладені цикли  (базові графічні примітиви 2)******//
package main;

public class Main {
    public static void main(String[] args) {
        int rows = 6;
        int k = 0;
        //******Фігура 1******//
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(". ");
            }
            System.out.println();
        } 
        
        for (int i = rows-1; i > 0; i--) {
        	for (int j = 0; j < i; j++) {
        			System.out.print(". ");
        	}
        	System.out.println();
        }
        System.out.println();
        		//******Фігура 2******//
        for (int i = 1; i <= rows-1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(". ");
            }
            System.out.println();
        } 
        
		for (int i = rows; i > 0; i--) {
		    for (int j = 0; j < k; j++) {
		        System.out.print("  ");
		    }
		    for (int j = 0; j < i; j++) {
		        System.out.print(". ");
		    }
		    System.out.println();
		    k++;
		}
			System.out.println();
				//******Фігура 3******//
		for (int i = 0; i < rows-1; i++) {
		    for (int j = 0; j < rows - i - 1; j++) {
		        System.out.print("  ");
		    }
		
		    for (k = 0; k <= i; k++) {
		        System.out.print(". ");
		    }
		
		    System.out.println();
		}

			k=0;
		for (int i =rows; i > 0; i--) {
		    for (int j = 0; j < k; j++) {
		        System.out.print("  ");
		    }
		    for (int j = 0; j < i; j++) {
		        System.out.print(". ");
		    }
		    System.out.println();
		    k++;
		}
		System.out.println();
				//******Фігура 4******//
		for (int i = 0; i < rows-1; i++) {
		    for (int j = 0; j < rows - i - 1; j++) {
		        System.out.print("  ");
		    }
		
		    for (k = 0; k <= i; k++) {
		        System.out.print(". ");
		    }
		
		    System.out.println();
		}
		for (int i = rows; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(". ");
				}
			System.out.println();
			}
		System.out.println();
				//******Фігура 5******//
		for (int i = 0; i < rows; i++) {
		    for (int j = 0; j < rows - i - 1; j++) {
		        System.out.print("  ");
		    }
		
		    for (k = 0; k <= i; k++) {
		        System.out.print(". ");
		    }
		
		    System.out.println();
		}
		for (int i = 0; i < rows/2; i++) {
		    for (int j = 0; j < rows; j++) {
		        System.out.print(". ");
		    }
		    System.out.println();
		}
		k=0;
			for (int i = rows; i > 0; i--) {
				for (int j = 0; j < k; j++) {
					System.out.print("  ");
				}
				for (int j = 0; j < i; j++) {
					System.out.print(". ");
				}
				System.out.println();
				k++;
			}
			System.out.println();
			//******Фігура 6******//
		for (int i = 0; i < rows; i++) {
		    for (int j = 0; j < rows - i - 1; j++) {
		        System.out.print("  ");
		    }	
		    for (k = 0; k <= i; k++) {
		        System.out.print(". ");
		    }	
		    System.out.println();
		}
		for (int i = 0; i < rows/2; i++) {
		    for (int j = 0; j < rows; j++) {
		        System.out.print(". ");
		    }
		    System.out.println();		    
		}
		for (int i = rows; i > 0; i--) {
			for (int j = 0; j < i; j++) {
					System.out.print(". ");
					}
			System.out.println();
		}
    }    
}