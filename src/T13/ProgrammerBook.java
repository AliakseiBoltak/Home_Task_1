package T13;

import java.util.Objects;

public class ProgrammerBook extends Book {

	private String language;
	private int level;

	public ProgrammerBook(String title, String author, int price, int edition, String language, int level) {
		super(title, author, price, edition);
		this.setLanguage(language);
		this.setLevel(level);
	}

	@Override
	public String toString() {
		return super.toString() + ", language=" + language + ", level=" + level;
	}

	@Override
	public int hashCode() {
		return super.hashCode() + Objects.hash(language, level);
	}

	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj)) {
			return false;
		} else {
			ProgrammerBook temp = (ProgrammerBook) obj;
			return language == temp.language
					&& (language == temp.language || (language != null && language.equals(temp.getLanguage())))
					&& (level == temp.level);
		}
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}
