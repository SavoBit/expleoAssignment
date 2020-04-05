package com.ExpleoGroup.Staff.Types;

import java.util.Date;

public interface IEmployee {

	void signIn(Date signInDate);
	void signOut(Date signOutDate);
	Boolean resign();
	
}
