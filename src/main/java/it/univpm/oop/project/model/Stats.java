package it.univpm.oop.project.model;
/**
 * Model Stats
 * @author Andrea
 *
 */
public class Stats {

	private int mediaComments;
	private int hashtagComments;
	private int sumCommentsLength;
	private double averageCommentsLength;
	private int minCommentsLength;
	private int maxCommentsLength;
	private int emoticonComments;
	
	public Stats(int mediaComments, int hashtagComments, int sumCommentsLength, double averageCommentsLength,
			int minCommentsLength, int maxCommentsLength, int emoticonComments) {
		this.mediaComments = mediaComments;
		this.hashtagComments = hashtagComments;
		this.sumCommentsLength = sumCommentsLength;
		this.averageCommentsLength = averageCommentsLength;
		this.minCommentsLength = minCommentsLength;
		this.maxCommentsLength = maxCommentsLength;
		this.emoticonComments = emoticonComments;
	}

	public int getMediaComments() {
		return mediaComments;
	}

	public void setMediaComments(int mediaComments) {
		this.mediaComments = mediaComments;
	}

	public int getHashtagComments() {
		return hashtagComments;
	}

	public void setHashtagComments(int hashtagComments) {
		this.hashtagComments = hashtagComments;
	}

	public int getSumCommentsLength() {
		return sumCommentsLength;
	}

	public void setSumCommentsLength(int sumCommentsLength) {
		this.sumCommentsLength = sumCommentsLength;
	}

	public double getAverageCommentsLength() {
		return averageCommentsLength;
	}

	public void setAverageCommentsLength(double averageCommentsLength) {
		this.averageCommentsLength = averageCommentsLength;
	}

	public int getMinCommentsLength() {
		return minCommentsLength;
	}

	public void setMinCommentsLength(int minCommentsLength) {
		this.minCommentsLength = minCommentsLength;
	}

	public int getMaxCommentsLength() {
		return maxCommentsLength;
	}

	public void setMaxCommentsLength(int maxCommentsLength) {
		this.maxCommentsLength = maxCommentsLength;
	}

	public int getEmoticonComments() {
		return emoticonComments;
	}

	public void setEmoticonComments(int emoticonComments) {
		this.emoticonComments = emoticonComments;
	}

	


}
