package teams;

/**
 * Each instance of this class represents a student in a project collaboration graph.
 * 
 * @invar The bidirecional association is consistent.
 *      | getTeammate() == null || getTeammate().getTeammate() == this
 */
public class Student {
	
	/**
	 * @peerObject
	 */
	public Student getTeammate() { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * @post | getTeammate() == null
	 */
	public Student() { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * @pre | other != null
	 * @pre | other.getTeammate() == null
	 * @mutates | this, other
	 * @post | getTeammate() == other
	 */
	public void setTeammate(Student other) { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * @pre | getTeammate() != null
	 * @mutates | this, getTeammate()
	 * @post | getTeammate() == null
	 * @post | old(getTeammate()).getTeammate() == null
	 */
	public void stopCollaboration() { throw new RuntimeException("Not yet implemented"); }
}
