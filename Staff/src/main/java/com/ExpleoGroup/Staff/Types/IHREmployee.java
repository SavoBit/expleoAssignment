package com.ExpleoGroup.Staff.Types;

import com.ExpleoGroup.Staff.Entities.QAEmployee;
import com.ExpleoGroup.Staff.Entities.QEEmployee;

public interface IHREmployee extends IEmployee{
	
	void hire(QAEmployee employee);
	void hire(QEEmployee employee);

	void screen();
	
}
