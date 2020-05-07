/*
 * Title.java
 * Luke Grammer, Lauren Haylock, and Davis Beilue
 * CSCE 315-907
 * 10/15/2019
 */

package data.model;

/**
 * Title class to store title information retrieved from the database.
 */
public class Title {

	/** The unique title identifier. */
	private String titleID;

	/** The type of title. (ex: 'videoGame', 'movie', tvSeries', etc...) */
	private String type;

	/** The title name. */
	private String title;

	/** The original title name. */
	private String originalTitle;

	/** Is the title strictly for adults?. */
	private Boolean adult;

	/** The year of the title's initial release. */
	private Integer startYear;

	/** The year of the title's final release (if applicable). */
	private Integer endYear;

	/** The runtime of the title. */
	private Integer runtime;

	/** The different genres of the title. */
	private String[] genres;

	/** The average rating of the title. */
	private Double rating;

	/** The number of distinct ratings the title has. */
	private Integer numVotes;

	/** The episode number if applicable. */
	private Integer season;

	/** The episode number if applicable. */
	private Integer episode;

	/** The directors of the title. */
	private String[] directors;

	/** The writers of the title. */
	private String[] writers;

	/**
	 * Basic parameterized constructor for the title.
	 *
	 * @param titleID       the unique title ID
	 * @param type          the type of the title
	 * @param title         the title name
	 * @param originalTitle the original title name
	 * @param adult         indicates if the title is for adults
	 * @param startYear     the initial release year of the title
	 * @param endYear       the end year of the title
	 * @param runtime       the runtime of the title
	 * @param genres        the genres of the title
	 * @param rating        the title's average rating
	 * @param numVotes      the number of distinct ratings of the title
	 * @param season        the season of the title
	 * @param episode       the episode of the title
	 * @param directors     the directors of the title
	 * @param writers       the writers of the title
	 */
	public Title(String titleID, String type, String title, String originalTitle, Boolean adult, Integer startYear,
			Integer endYear, Integer runtime, String[] genres, Double rating, Integer numVotes, Integer season,
			Integer episode, String[] directors, String[] writers) {
		this.titleID = titleID;
		this.type = type;
		this.title = title;
		this.originalTitle = originalTitle;
		this.adult = adult;
		this.startYear = startYear;
		this.endYear = endYear;
		this.runtime = runtime;
		this.genres = genres;
		this.rating = rating;
		this.numVotes = numVotes;
		this.season = season;
		this.episode = episode;
		this.directors = directors;
		this.writers = writers;
	}

	/**
	 * Gets the season.
	 *
	 * @return the season
	 */
	public Integer getSeason() {
		return season;
	}

	/**
	 * Sets the season.
	 *
	 * @param season the new season
	 */
	public void setSeason(Integer season) {
		this.season = season;
	}

	/**
	 * Gets the episode.
	 *
	 * @return the episode
	 */
	public Integer getEpisode() {
		return episode;
	}

	/**
	 * Sets the episode.
	 *
	 * @param episode the new episode
	 */
	public void setEpisode(Integer episode) {
		this.episode = episode;
	}

	/**
	 * Gets the unique title ID.
	 *
	 * @return the title ID
	 */
	public String getTitleID() {
		return titleID;
	}

	/**
	 * Sets the unique title ID.
	 *
	 * @param titleID the new title ID
	 */
	public void setTitleID(String titleID) {
		this.titleID = titleID;
	}

	/**
	 * Gets the title's type.
	 *
	 * @return the type of the title
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the title's type.
	 *
	 * @param type the new type of the title
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Gets the title name.
	 *
	 * @return the title name
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the title name.
	 *
	 * @param title the new title name
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets the original title name.
	 *
	 * @return the original title name
	 */
	public String getOriginalTitle() {
		return originalTitle;
	}

	/**
	 * Sets the original title name.
	 *
	 * @param originalTitle the new original title name
	 */
	public void setOriginalTitle(String originalTitle) {
		this.originalTitle = originalTitle;
	}

	/**
	 * Gets an boolean indicating if the title is for adults.
	 *
	 * @return the flag indicating if the title is for adults
	 */
	public Boolean getAdult() {
		return adult;
	}

	/**
	 * Sets the boolean indicating if the title is for adults.
	 *
	 * @param adult the flag indicating if the title is fir adults
	 */
	public void setAdult(Boolean adult) {
		this.adult = adult;
	}

	/**
	 * Gets the year of the title's initial release.
	 *
	 * @return the start year
	 */
	public Integer getStartYear() {
		return startYear;
	}

	/**
	 * Sets the year of the title's initial release.
	 *
	 * @param startYear the new start year
	 */
	public void setStartYear(Integer startYear) {
		this.startYear = startYear;
	}

	/**
	 * Gets the title's final release year.
	 *
	 * @return the end year
	 */
	public Integer getEndYear() {
		return endYear;
	}

	/**
	 * Sets the year of the title's final release.
	 *
	 * @param endYear the new end year
	 */
	public void setEndYear(Integer endYear) {
		this.endYear = endYear;
	}

	/**
	 * Gets the runtime of the title.
	 *
	 * @return the runtime of the title
	 */
	public Integer getRuntime() {
		return runtime;
	}

	/**
	 * Sets the runtime of the title.
	 *
	 * @param runtime the new runtime of the title
	 */
	public void setRuntime(Integer runtime) {
		this.runtime = runtime;
	}

	/**
	 * Gets the title's genres.
	 *
	 * @return the list of genres corresponding to the title
	 */
	public String[] getGenres() {
		return genres;
	}

	/**
	 * Sets the genres associated with the title.
	 *
	 * @param genres the new list of genres
	 */
	public void setGenres(String[] genres) {
		this.genres = genres;
	}

	/**
	 * Gets the title's average rating.
	 *
	 * @return the average rating of the title
	 */
	public Double getRating() {
		return rating;
	}

	/**
	 * Sets the average rating.
	 *
	 * @param rating the new average rating
	 */
	public void setRating(Double rating) {
		this.rating = rating;
	}

	/**
	 * Gets the number of distinct ratings the title has.
	 *
	 * @return the number of ratings
	 */
	public Integer getNumVotes() {
		return numVotes;
	}

	/**
	 * Sets the number of distinct ratings the title has.
	 *
	 * @param numVotes the new number of ratings
	 */
	public void setNumVotes(Integer numVotes) {
		this.numVotes = numVotes;
	}

	/**
	 * Gets the directors of the title.
	 *
	 * @return the list of directors of the title
	 */
	public String[] getDirectors() {
		return directors;
	}

	/**
	 * Sets the directors of the title.
	 *
	 * @param directors the new list of directors
	 */
	public void setDirectors(String[] directors) {
		this.directors = directors;
	}

	/**
	 * Gets the writers of the title.
	 *
	 * @return the list of writers of the title
	 */
	public String[] getWriters() {
		return writers;
	}

	/**
	 * Sets the writers of the title.
	 *
	 * @param writers the new list of writers
	 */
	public void setWriters(String[] writers) {
		this.writers = writers;
	}
}
