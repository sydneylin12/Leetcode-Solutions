class TimeMap {
    public Map<String, TreeMap<Integer, String>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        TreeMap<Integer, String> m = map.getOrDefault(key, new TreeMap<>());
        m.put(timestamp, value);
        map.put(key, m);
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        TreeMap<Integer, String> m = map.get(key);
        
        Integer floor = m.floorKey(timestamp);
            
        if(floor != null) return m.get(floor);
        else return "";
    }
}
​
/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
