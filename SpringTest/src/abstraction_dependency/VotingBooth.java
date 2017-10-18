/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraction_dependency;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Abhishek.Sehgal
 */
public class VotingBooth {

    VoteRecorder voteRecorder = new VoteRecorder();
    public void vote(Candidate candidate) {
        voteRecorder.record(candidate);
    }
    class VoteRecorder {
        Map hVotes = new HashMap();
        public void record(Candidate candidate) {
            int count = 0;
            if (!hVotes.containsKey(candidate)) {
                hVotes.put(candidate, count);
            } else {
                count = (int) hVotes.get(candidate);
            }
            count++;
            hVotes.put(candidate, count);
        }
    }
}
