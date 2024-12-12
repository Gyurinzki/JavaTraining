package meetingrooms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Office {

    private List<MeetingRoom> meetingrooms = new ArrayList<>();

    public void addMeetingRoom(String name, int width, int length){
      MeetingRoom meetingRoom = new MeetingRoom(name, width, length);
      meetingrooms.add(meetingRoom);
    }

    public List<MeetingRoom> getMeetingRooms(){
        return meetingrooms;
    }

    public List<MeetingRoom> getMeetingroomsInReverseOrder(){
        List<MeetingRoom> result = new ArrayList<>();
        for (int i = (meetingrooms.size() -1); i >=0; i++){
           result.add(meetingrooms.get(i));
        }
        return result;
    }

    public List<MeetingRoom> getEverySecondMeetingRoom(int number){
        List<MeetingRoom> result = new ArrayList<>();

        if (number == 1) {
            for (int i = 0; i < meetingrooms.size(); i += i +1){
                result.add(meetingrooms.get(i));
            }
        }if (number == 2) {
            for (int i = 1; i < meetingrooms.size(); i += i +1){
                result.add(meetingrooms.get(i));
            }
        }
        return result;
    }

    public MeetingRoom getMeetingRoomWithGivenName(String name){
     for (MeetingRoom meetingRoom : meetingrooms) {
         if (meetingRoom.getName().endsWith(name)){
             return meetingRoom;
         }
     }
     return null;

     public List<MeetingRoom> getMeetingRoomWithGivenNamePart(String namePart) {
         List<MeetingRoom> result = new ArrayList<>();
         for (MeetingRoom meetingRoom : meetingrooms){
             if (meetingRoom.getName().indexOf(namePart) >= 0) {
                 result.add(meetingRoom);
             }
             return result;
         }
     }


        public List<MeetingRoom> getMeetingRoomsWithAreaLargerThan(int area){
            List<MeetingRoom> result = new ArrayList<>();
            for (MeetingRoom meetingRoom : meetingrooms){
                if (MeetingRoom.getArea() > area) {
                    result.add(meetingRoom);
                }
            }
            return result;

















        }












}
