/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inversion;

/**
 *
 * @author Abhishek.Sehgal
 */
public class VotingBooth {
 VoteRecorder recorder = null;
public void setVoteRecorder(VoteRecorder recorder) {
this.recorder = recorder;
}
public void vote(Candidate candidate) {
recorder.record(candidate);
}   
}
