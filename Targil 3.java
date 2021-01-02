//Task 14: 
        Scanner s = new Scanner(System.in);
       int [] kod = { 6,4,9};
       int [] user =  new int [3];
       for ( int i = 0; i < kod.length; i++) {
           System.out.println(" Enter 3 numbers: ");
           user[i] = s.nextInt();
           if (Arrays.equals(kod, user)) {
               System.out.println(Arrays.toString(user) );
               System.out.println("Access granted");}
           else
              System.out.println(" Wrong");
           }
           
 // Task 15: 
         Scanner s = new Scanner(System.in);
         System.out.println(" Enter the word: ");
         String word = s.next();
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
             count++;
        }
        System.out.println("The number of letters  is " + count);   
           
 // Task 18: 
        int array[] = {1, 12, 6, -4, 4, 5, -13, -5, 2, 3};
        int max = 0;
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(String.format(" Max element is %d ", max));
        System.out.println(String.format(" Min element is %d ", min));

        }
    
 //Task 20: 
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < a.length / 2; i++) {
            int tmp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = tmp;
        }
        System.out.println(Arrays.toString(a));
