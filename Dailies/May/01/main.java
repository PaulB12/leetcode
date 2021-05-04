class WordFilter {

    String[] words;
    
    public WordFilter(String[] words) {
        this.words = words;
    }
    
    public int f(String prefix, String suffix) {
        Integer lengthOfPrefix = prefix.length();
        Integer lengthOfSuffix = suffix.length();
        Integer counter = 0;
        for(String word : this.words) {
            Integer wordPos = Math.min(word.length(), lengthOfPrefix);
            if((word.substring(0, wordPos)).contentEquals(prefix)) {
                if((word.substring((wordPos-lengthOfPrefix), wordPos)).contentEquals(suffix)) {
                    counter += 1;
                } 
            }
        }
        return counter;
    }
}
