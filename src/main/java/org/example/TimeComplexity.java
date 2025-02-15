package org.example;

public class TimeComplexity {
//    public static void practice1() {
//        int a = 0, b = 0;
//        for (i = 0; i < N; i++) {
//            a = a + Math.random();
//        }
//        for (j = 0; j < M; j++) {
//            b = b + Math.random();
//        }
//    }                 O(N+M)

    //int a = 0;
    //for (i = 0; i < N; i++) {
    //    for (j = N; j > i; j--) {
    //        a = a + i + j;
    //    }
    //} O(N^2)

    //int i, j, k = 0;
    //for (i = n / 2; i <= n; i++) {
    //    for (j = 2; j <= n; j = j * 2) {
    //        k = k + n / 2;
    //    }
    //} O(nlogn)


}

//// 1. Even or odd
//
//function isEven(value){
//  if (value % 2 == 0){
//    return true;
//  }
//  else
//    return false;
//}
//
///*
//Answer: O(1). Constant run time complexity.
//Reasoning: Because you're only ever taking one value, there is no "loop" to go through.
//Even as the value gets bigger, you simply divide it by 2 and see whether it returns an integer or a float.
//*/
//
//
//// 2. Are You Here?
//
//function areYouHere(arr1, arr2) {
//  //let ticks1, ticks2 = 0;
//    for (let i=0; i<arr1.length; i++) {
//        const el1 = arr1[i];
//        //ticks1++;
//        for (let j=0; j<arr2.length; j++) {
//            const el2 = arr2[j];
//            //ticks2++;
//            if (el1 === el2) return true;
//        }
//      //console.log(ticks1);
//      //console.log(ticks2);
//    }
//    return false;
//}
//
///*
//Answer: O(n^2). Quadratic run time complexity.
//Reasoning: For each run through the first loop, you have to run through the entire second loop.
//If you add even just one more item to `arr1`, you have to run another full loop through `arr2`.
//So it's quadratic because as N doubles (taking N as `arr1.length` or `arr2.length`), the time it takes
//will increase exponentially (N * N).
//
//UPDATE: As per the comments below, the above answer assumes somewhat naively that the two arrays would have the same lengths.
//It's quite likely that they don't have the same lengths; therefore the complexity would be in fact O(n*m) instead of O(n^2).
//*/
//
//
//// 3. Doubler
//
//function doubleArrayValues(array) {
//    for (let i=0; i<array.length; i++) {
//        array[i] *= 2;
//    }
//    return array;
//}
//
///*
//Answer: O(n). Linear run time complexity.
//Reasoning: As `array.length` increases, the number of iterations increases at the same rate.
//This is because you don't have to loop any more than once: however many items are in the array
//is how many times you run the function.
//*/
//
//
//// 4. Naive Search
//
//function naiveSearch(array, item) {
//    for (let i=0; i<array.length; i++) {
//        if (array[i] === item) {
//            return i;
//        }
//    }
//}
//
///*
//Answer: O(n). Linear run time complexity.
//Reasoning: Same as above with the doubler. You have to check each and every item once and only once
//in order to determine whether you've got a match.
//*/
//
//
//// 5. Creating Pairs
//
//function createPairs(arr) {
//  //let ticks = 0;
//    for (let i = 0; i < arr.length; i++) {
//        for(let j = i+1; j < arr.length; j++) {
//            console.log(arr[i] + ", " +  arr[j] );
//            //ticks++;
//        }
//    }
//  //console.log(ticks);
//}
//
///* Answer: O(n^2). Quadratic run time complexity.
//Reasoning: The first loop has O(n) complexity, as with each new addition, the number of times
//you run through the loop increases by one. As the inner loop also has O(n) complexity, together they have
//quadratic run time complexity.
//*/
//
//
//// 6. Computing Fibonacci Numbers
//
//function generateFib(num) {
//  let result = [];
//  //let ticks = 0;
//  for (let i = 1; i <= num; i++) {
//    //ticks++;
//    if (i === 1) {
//      result.push(0);
//    }
//    else if (i == 2) {
//      result.push(1);
//    }
//    else {
//      result.push(result[i - 2] + result[i - 3]);
//    }
//  }
//  //console.log(ticks);
//  return result;
//}
//
///* Answer: O(n). Linear run time complexity.
//Reasoning: As you add 1 to `num`, the run time complexity increases at the same rate.
//*/
//
//
//// 7. Efficient Search
//
//function efficientSearch(array, item) {
//    let minIndex = 0;
//    let maxIndex = array.length - 1;
//    let currentIndex;
//    let currentElement;
//
//    while (minIndex <= maxIndex) {
//        currentIndex = Math.floor((minIndex + maxIndex) / 2);
//        currentElement = array[currentIndex];
//
//        if (currentElement < item) {
//            minIndex = currentIndex + 1;
//        }
//        else if (currentElement > item) {
//            maxIndex = currentIndex - 1;
//        }
//        else {
//            return currentIndex;
//        }
//    }
//    return -1;
//}
//
///* Answer: O(log n). Logarithmic run time complexity.
//Reasoning: Cutting `array.length` in half in each iteration, the time complexity increases slowly, in a logarithmic fashion.
//*/
//
//
//// 8. Random element
//
//function findRandomElement(arr) {
//    return arr[Math.floor(Math.random() * arr.length)];
//}
//
///* Answer: O(1). Constant run time complexity.
//Reasoning: With no iteration occurring, selecting an element at random from an array has constant time complexity.
//*/
//
//
//// 9. Is It Prime?
//
//function isPrime(n) {
//    if (n < 2 || n % 1 != 0) {
//        return false;
//    }
//    for (let i = 2; i < n; ++i) {
//        if (n % i == 0) return false;
//    }
//    return true;
//}
//
///* Answer: O(n). Linear run time complexity.
//Reasoning: Disregarding the constant time it takes to check the first if condition, this function is linear,
//as it iterates through each item once and only once.
//*/
//
//
//// 10. Factorial of a number w/ recursion
//
//function factorialOf(n) {
//    switch (n) {
//        case 0:
//        case 1:
//            return 1;
//        default: return n * factorialOf(n - 1);
//    }
//}
//
///* Answer: O(n). Linear run time complexity.
//Reasoning: This function is being called recursively n times before reaching the base case.
//*/
