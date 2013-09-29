// default package
// Generated Jul 31, 2013 2:03:33 PM by Hibernate Tools 3.4.0.CR1
package org.akaza.openclinica.domain.datamap;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.akaza.openclinica.domain.AbstractMutableDomainObject;

/**
 * SubjectEventStatus generated by hbm2java
 */
@Entity
@Table(name = "subject_event_status", schema = "public")
public class SubjectEventStatus  extends AbstractMutableDomainObject {

	private int subjectEventStatusId;
	private String name;
	private String description;

	public SubjectEventStatus() {
	}

	public SubjectEventStatus(int subjectEventStatusId) {
		this.subjectEventStatusId = subjectEventStatusId;
	}

	public SubjectEventStatus(int subjectEventStatusId, String name,
			String description) {
		this.subjectEventStatusId = subjectEventStatusId;
		this.name = name;
		this.description = description;
	}

	@Id
	@Column(name = "subject_event_status_id", unique = true, nullable = false)
	public int getSubjectEventStatusId() {
		return this.subjectEventStatusId;
	}

	public void setSubjectEventStatusId(int subjectEventStatusId) {
		this.subjectEventStatusId = subjectEventStatusId;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description", length = 1000)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}