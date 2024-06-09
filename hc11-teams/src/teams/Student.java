package teams;

/**
 * Each instance of this class represents a student in a project collaboration graph.
 * 
 * @invar The bidirecional association is consistent.
 *     | getTeammate() == null || getTeammate().getTeammate() == this
 */
public class Student {
	
	/**
	 * @peerObject
	 * 
	 * @invar The bidirecional association is consistent.
     *     | teammate == null || teammate.teammate == this
	 */
	private Student teammate;
	
	/**
	 * @peerObject
	 */
	public Student getTeammate() { return teammate; } // no representation exposure because @peerObject and not @representationObject
	                                                  // .copyOf() would be WRONG
	
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
	public void setTeammate(Student other) {
		teammate = other;
		other.teammate = this;
	}
	
	/**
	 * @pre | getTeammate() != null
	 * @mutates | this, getTeammate()
	 * @post | getTeammate() == null
	 * @post | old(getTeammate()).getTeammate() == null
	 */
	public void stopCollaboration() { 
		teammate.teammate = null;
		teammate = null;
	}
}
