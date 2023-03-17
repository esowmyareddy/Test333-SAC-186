public class ConfigureOnedrive {
 
	private String username;
	private String password;
	private String url;
	private String repositoryName;
 
	public ConfigureOnedrive() {
 
	}
 
	public boolean isAuthenticated() {
		// validate the ONEDRIVE credentials and return a response indicating whether authentication was successful or not.
		return true;
	}
 
	public List<OnedriveDetails> getOnedriveDetails() {
		// get the list with Title, User Name, URL, Action.
		return new ArrayList<>();
	}
 
	public void editOnedriveDetails(OnedriveDetails onedriveDetails) {
		// edit button and delete button to make any changes to the displayed list Title, User Name and URL.
	}
 
	public void saveOnedriveDetails(OnedriveDetails onedriveDetails) {
		// click on save button to configure.
	}
 
	public void resetOnedriveDetails() {
		// click on reset button to enter the details again.
	}
 
	public void changeNumberOfEntries(int numberOfEntries) {
		// change the No of entries to display in the list, while clicking on dropdown button in “Show entries”.
	}
 
	public void displayPagination() {
		// display pagination under the list.
	}
 
	public void changePageNumber() {
		// click on pagination to change the page numbers.
	}
 
	public void addMoreOnedrive() {
		// click on Add more button above the list to configure other ONEDRIVE.
	}
 
	public void displayPopUpForm() {
		// display Pop Up form.
	}
 
	public void enterOnedriveDetails() {
		// Ability to enter the required details.
	}
 
	public class OnedriveDetails {
		private String title;
		private String username;
		private String url;
 
		public OnedriveDetails(String title, String username, String url) {
			this.title = title;
			this.username = username;
			this.url = url;
		}
 
		public String getTitle() {
			return title;
		}
 
		public void setTitle(String title) {
			this.title = title;
		}
 
		public String getUsername() {
			return username;
		}
 
		public void setUsername(String username) {
			this.username = username;
		}
 
		public String getUrl() {
			return url;
		}
 
		public void setUrl(String url) {
			this.url = url;
		}
	}
}