class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> min = new Stack<>();
   // int min = -1;

    public MinStack() {

    }
    public void push(int val){
    //     if(st.isEmpty())
    //     {
    //         st.push(val);
    //         min = val;
    //     }
    //    else if(val >= min){
    //         st.push(val);
    //     }
    //    else if(val < min){
    //         st.push(2*val - min);
    //         min = val;
    //     }



       if(st.isEmpty()) {
           st.push(val);
           min.push(val);
       }
       else{
           st.push(val);
           if(min.peek() < val) min.push(min.peek());
           else min.push(val);
       }

}
public void pop(){

 st.pop();
 min.pop();



//     if(st.isEmpty()) return;

//    else if(st.peek() >= min){
//         st.pop();
//     }
//    else if(st.peek() < min){
//         int old = 2*min - st.peek();
//         min = old;
//         st.pop();
//     }

}
public int top(){
      return st.peek();



//     if(st.isEmpty())  return -1;
    

//    else if(st.peek() >= min){
//         return st.peek();
//     }
//    else if(st.peek() < min){
//         return min;
//     }
//     return -1;

}
public int getMin(){
        return min.peek();


    // if(st.isEmpty()){
    //     return -1;
    // }
    // return min;

}
}
