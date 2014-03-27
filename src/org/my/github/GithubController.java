package org.my.github;

import java.util.Calendar;

public class GithubController {
	public int getFirstBranch() {
		return 1;
	}

	public int getSecondBranch() {
		return 2;
	}
	
	public String getSecondBranchName() {
		// Adding a comment to getSecondBranchName method.
		String dateAsString = GithubUtil.getDateAsString(
				Calendar.getInstance().getTime());
		if (dateAsString != null) {
			return dateAsString;
		}
		return "branch_2";
	}
}
