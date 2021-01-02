// Part2 , task 1 : 
       for (int row = 0; row < 5; row++) {
       for (int column = 1; column < 11; column++) {
            System.out.print(column);
            System.out.print(" ");
            }
            System.out.println();
        }
 // Task2 : 
        String [] week = { "Sunday","Monday","Tuesday","Wednesday","Thursday","Friday", "Saturday"};
        for (int i = 0; i < 4; i++) {
            System.out.println(Arrays.toString(week));
          }
 // Task 3 : 
            for (int i = 1; i <= 10; i++) {
            int result = i;
            System.out.println(String.format(" %d ^ %d = %d", i, 1, result));
            for (int n = 2; n <= 5; n++) {
                int a = i;
                result = result * a;
                System.out.println(String.format(" %d ^ %d = %d", i, n, result));
            }
        }
       
// Task 4 : 
        int numbers = 10;
        int fact = 1;
        for (int index = 1; index <= numbers; index++) {
            fact = fact * index;
            System.out.println(String.format("factorial for numbers 1-10  = %d", fact));
        }
//Task 5: 
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the orech: ");
        int orech = s.nextInt();
        System.out.println("Please enter the rohav: ");
        int rohav = s.nextInt();
        for (int i = orech; i >= 1; i--) {
            for (int a = rohav; a >= 1; a--) {
                System.out.print(" * ");
            }
            System.out.println(" * ");
        }
 // Task 6: 
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the width :");
        int width = s.nextInt();
        System.out.println("Enter the length :");
        int length= s.nextInt();
        {
            for (int y= 0; y < length; y++)
            {
                for (int x= 0; x < width; x++)
                {
                    if (x == 0 || y == 0)
                    {
                        System.out.print("*");
                    }
                    else if (x != width && y == length-1)
                    {
                        System.out.print("*");
                    }
                    else if (y != length && x == width-1)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println(" ");
            }
        }
 // Task 7: 
      Scanner s = new Scanner(System.in);
      System.out.println( " Enter the size of the triangle:" );
        int malben = s.nextInt();
        for (int i = 0; i <= malben; i++){
            for (int j = malben; j > i; j--){
                System.out.print(" ");
            }
            for (int j1 = 0; j1 <= i; j1++){
                System.out.print("*");
            }
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            for (int j = malben; j > i; j--){
                System.out.print(" ");
            }
                System.out.println(" ");
        }
        
