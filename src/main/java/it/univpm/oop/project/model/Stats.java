package it.univpm.oop.project.model;

/**
 * The Class Stats.
 */
public class Stats {

	/** The media comments. */
	private int mediaComments;
	
	/** The hashtag comments. */
	private int hashtagComments;
	
	/** The sum comments length. */
	private int sumCommentsLength;
	
	/** The average comments length. */
	private double averageCommentsLength;
	
	/** The min comments length. */
	private int minCommentsLength;
	
	/** The max comments length. */
	private int maxCommentsLength;
	
	/** The emoticon comments. */
	private int emoticonComments;
	
	/**
	 * Instantiates a new stats.
	 *
	 * @param mediaComments the media comments
	 * @param hashtagComments the hashtag comments
	 * @param sumCommentsLength the sum comments length
	 * @param averageCommentsLength the average comments length
	 * @param minCommentsLength the min comments length
	 * @param maxCommentsLength the max comments length
	 * @param emoticonComments the emoticon comments
	 */
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

	/**
	 * Gets the media comments.
	 *
	 * @return the media comments
	 */
	public int getMediaComments() {
		return mediaComments;
	}

	/**
	 * Sets the media comments.
	 *
	 * @param mediaComments the new media comments
	 */
	public void setMediaComments(int mediaComments) {
		this.mediaComments = mediaComments;
	}

	/**
	 * Gets the hashtag comments.
	 *
	 * @return the hashtag comments
	 */
	public int getHashtagComments() {
		return hashtagComments;
	}

	/**
	 * Sets the hashtag comments.
	 *
	 * @param hashtagComments the new hashtag comments
	 */
	public void setHashtagComments(int hashtagComments) {
		this.hashtagComments = hashtagComments;
	}

	/**
	 * Gets the sum comments length.
	 *
	 * @return the sum comments length
	 */
	public int getSumCommentsLength() {
		return sumCommentsLength;
	}

	/**
	 * Sets the sum comments length.
	 *
	 * @param sumCommentsLength the new sum comments length
	 */
	public void setSumCommentsLength(int sumCommentsLength) {
		this.sumCommentsLength = sumCommentsLength;
	}

	/**
	 * Gets the average comments length.
	 *
	 * @return the average comments length
	 */
	public double getAverageCommentsLength() {
		return averageCommentsLength;
	}

	/**
	 * Sets the average comments length.
	 *
	 * @param averageCommentsLength the new average comments length
	 */
	public void setAverageCommentsLength(double averageCommentsLength) {
		this.averageCommentsLength = averageCommentsLength;
	}

	/**
	 * Gets the min comments length.
	 *
	 * @return the min comments length
	 */
	public int getMinCommentsLength() {
		return minCommentsLength;
	}

	/**
	 * Sets the min comments length.
	 *
	 * @param minCommentsLength the new min comments length
	 */
	public void setMinCommentsLength(int minCommentsLength) {
		this.minCommentsLength = minCommentsLength;
	}

	/**
	 * Gets the max comments length.
	 *
	 * @return the max comments length
	 */
	public int getMaxCommentsLength() {
		return maxCommentsLength;
	}

	/**
	 * Sets the max comments length.
	 *
	 * @param maxCommentsLength the new max comments length
	 */
	public void setMaxCommentsLength(int maxCommentsLength) {
		this.maxCommentsLength = maxCommentsLength;
	}

	/**
	 * Gets the emoticon comments.
	 *
	 * @return the emoticon comments
	 */
	public int getEmoticonComments() {
		return emoticonComments;
	}

	/**
	 * Sets the emoticon comments.
	 *
	 * @param emoticonComments the new emoticon comments
	 */
	public void setEmoticonComments(int emoticonComments) {
		this.emoticonComments = emoticonComments;
	}

}
