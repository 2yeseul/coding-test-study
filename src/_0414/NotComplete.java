package _0414;

import java.util.*;

public class NotComplete {
    public static String solution(String[] participants, String[] completions) {
        String answer = "";

        List<String> participantsList = new ArrayList<>(Arrays.asList(participants));
        List<String> completionsList = new ArrayList<>(Arrays.asList(completions));

        Collections.sort(participantsList); Collections.sort(completionsList);

        for(int i=0;i<participantsList.size();i++) {
            if(!participantsList.get(i).equals(completionsList.get(i))) {
                answer = participantsList.get(i);
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] participants = {"mislav", "stanko", "mislav", "ana"};
        String[] completions = {"stanko", "ana", "mislav"};

        String answer = solution(participants, completions);

        System.out.println(answer);
    }
}
