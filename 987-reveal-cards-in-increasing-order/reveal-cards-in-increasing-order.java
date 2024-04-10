class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
       int n=deck.length;
        Arrays.sort(deck);
        Deque <Integer> t=new ArrayDeque<>();
        t.addFirst(deck[n-1]);
        for(int i=n-2;i>=0;i--){
            t.addFirst(t.removeLast());
            t.addFirst(deck[i]);
        }
        for(int i=0;i<n;i++){
            deck[i]=(int)t.removeFirst();
        }
        return deck; 
    }
}