class UndergroundSystem {
    Map<Integer,Ride> inProgressRides;
    List<Ride> completedRides;
    public UndergroundSystem() {
        inProgressRides = new HashMap<>();
        completedRides = new ArrayList<>();
    }
    public void checkIn(int id, String stationName, int t) {
        inProgressRides.put(id,new Ride(id,stationName,t));
    }
    public void checkOut(int id, String stationName, int t) {
        var ride = inProgressRides.get(id);
        inProgressRides.put(id,null);
        ride.updateCheckOut(stationName,t);
        completedRides.add(ride);
    }
    public double getAverageTime(String startStation, String endStation) {
        return completedRides
        .stream()
        .filter(r->r.sName.equals(startStation)&&r.eName.equals(endStation))
        .map(r-> r.eTime-r.sTime)
        .mapToInt(Integer::intValue)
        .average()
        .orElse(0.0);
    }
}

class Ride{
    Integer id;
    String sName;
    String eName;
    Integer sTime;
    Integer eTime;

    Ride(Integer id,String sName,Integer sTime){
        this.id=id;
        this.sName=sName;
        this.sTime=sTime;
    }

    void updateCheckOut(String eName,Integer eTime){
        this.eTime=eTime;
        this.eName=eName;
    }
}
