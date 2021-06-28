/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package launch.comm.clienttasks;

import launch.comm.LaunchSession;
import tobcomm.TobComm;
import launch.game.LaunchClientGameInterface;


/**
 *
 * @author tobster
 */
public class JoinAllianceTask extends Task
{
    private int lAllianceID;
    
    public JoinAllianceTask(LaunchClientGameInterface gameInterface, int lAllianceID)
    {
        super(gameInterface);
        gameInterface.ShowTaskMessage(TaskMessage.ALLIANCE_JOIN);
        this.lAllianceID = lAllianceID;
    }
    
    @Override
    public void Start(TobComm comm)
    {
        comm.SendCommand(LaunchSession.JoinAlliance, lAllianceID);
    }
}
