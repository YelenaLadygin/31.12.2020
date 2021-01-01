//task 2 :
   int [] arr = {101,102,103,104,105};
   // 102 -1;
   // 105 - 4;
// Task 3: 
    int [] arr = {2,4,6};
        System.out.println(arr[1]);
        System.out.println(arr[2]);
 // Task 4: 
    System.out.println(arr_num1[arr_num1.length-1]);
 //Task 5: 
    int [] arr = new int [20];
 //Task 6: 
     String [] words = { "Welcome", "to" , "Java"};
 //Task 7 :
      int [] num = { -1,-2,-3,-4,-5};
        for ( int i =0; i< num.length; i++)
          System.out.println(num[i] );
 //Task 8: 
        int [] num = new int [10];
        int k=0;
        for ( int i =0; i< num.length; i++) {
            k++;
            num[i]=k;
        }
           for ( int i =1; i< num.length; i+=2)
            System.out.println(num[i]);
  //Task 9: 
         int [] num = new int [10];
        int k=0;
        for ( int i =0; i< num.length; i++) {
            k++;
            num[i]=k;
        }
           for ( int i = num.length-1; i>=0; i-=2)
            System.out.println(num[i]);
//Task 10:
        Scanner s = new Scanner(System.in);
        int [] num = new int [3];
        for ( int i =0; i< num.length; i++) {
            System.out.println("Enter the number:");
            num[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(num));
        
//Task11: Random r = new Random();
        int [] num = new int [5];
        for ( int i =0; i< num.length; i++) {
            num[i] = r.nextInt(50)+1;
        }
         System.out.println(Arrays.toString(num));
//Task12: 
 Random r = new Random();
        int [] num = new int [5];
        for ( int i =0; i< num.length; i++) {
            num[i] = r.nextInt(50)+1;
            if (num[i]%2==0) {
                System.out.println(num[i]) ;
           }
        }
        System.out.println(Arrays.toString(num));
        
 // Task 13: 
        int[] arr_num1 = {1, 2, 3, 4, 5};
        int[] arr_num2 = {1, 2, 3, 4, 5};
        if (Arrays.equals(arr_num1,arr_num2))
        System.out.println("the same");
        else
        System.out.println(" not the same");
        
 


 
 
