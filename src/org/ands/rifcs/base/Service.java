/**
 * Copyright 2009 The Australian National University (ANU)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ands.rifcs.base;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Class representing a RIF-CS Activity registry object.
 *
 * @author Scott Yeadon
 *
 */
public class Service extends RIFCSElement {
    /** List of Identifier nodes. */
    private List<Identifier> identifiers = new ArrayList<Identifier>();
    /** List of Name nodes. */
    private List<Name> names =  new ArrayList<Name>();
    /** List of Location nodes. */
    private List<Location> locations =  new ArrayList<Location>();
    /** List of Coverage nodes. */
    private List<Coverage> coverages =  new ArrayList<Coverage>();
    /** List of RelatedObject nodes. */
    private List<RelatedObject> relatedObjects =
            new ArrayList<RelatedObject>();
    /** List of Subject nodes. */
    private List<Subject> subjects =  new ArrayList<Subject>();
    /** List of Description nodes. */
    private List<Description> descriptions =  new ArrayList<Description>();
    /** List of RelatedInfo nodes. */
    private List<RelatedInfo> ris =  new ArrayList<RelatedInfo>();
    /** List of Rights nodes. */
    private List<Rights> rightsList =  new ArrayList<Rights>();
    /** List of ExistenceDates nodes. */
    private List<ExistenceDates> existenceDates =
            new ArrayList<ExistenceDates>();
    /** List of AccessPolicy nodes. */
    private List<AccessPolicy> aps =  new ArrayList<AccessPolicy>();

    /**
     * Construct an Activity object.
     *
     * @param n
     *        A w3c Node, typically an Element
     *
     * @throws RIFCSException A RIFCSException
     */
    protected Service(final Node n) throws RIFCSException {
        super(n, Constants.ELEMENT_SERVICE);
        initStructures();
    }


    /**
     * Set the type.
     *
     * @param type
     *          The type of service being described
     */
    public final void setType(final String type) {
        super.setAttributeValue(Constants.ATTRIBUTE_TYPE, type);
    }


    /**
     * return the type.
     *
     * @return
     *      The type attribute value or empty string if attribute
     *      is empty or not present
     */
    public final String getType() {
        return super.getAttributeValue(Constants.ATTRIBUTE_TYPE);
    }


    /**
     * Set the date the service metadata was modified.
     *
     * @param date
     *      A date object representing the date the service metadata
     *      was last modified
     */
    public final void setDateModified(final Date date) {
        super.setAttributeValue(Constants.ATTRIBUTE_DATE_MODIFIED,
                RegistryObject.formatDate(date));
    }


    /**
     * Set the date the service metadata was last modified.
     *
     * @param date
     *      A string in UTC and of one of the forms described in section 3.2.7
     *      of the <a href="http://www.w3.org/TR/xmlschema-2/">W3C's Schema
     *      Data Types document</a>
     */
    public final void setDateModified(final String date) {
        super.setAttributeValue(Constants.ATTRIBUTE_DATE_MODIFIED, date);
    }


    /**
     * return the date modified.
     *
     * @return
     *      The dateModified attribute value or empty string if attribute
     *      is empty or not present
     */
    public final String getDateModified() {
        return super.getAttributeValue(Constants.ATTRIBUTE_DATE_MODIFIED);
    }


    /**
     * Create and return an empty Identifier object.
     *
     * The returned object has no properties or content and is not part
     * of the RIF-CS document, it is essentially a constructor of an object
     * owned by the RIF-CS document. The returned object needs to be
     * "filled out" (e.g. with properties, additional sub-elements, etc)
     * before being added to the RIF-CS document.
     *
     * @return the new Identifier object
     *
     * @throws RIFCSException A RIFCSException
     *
     */
    public final Identifier newIdentifier() throws RIFCSException {
        return new Identifier(this.newElement(Constants.ELEMENT_IDENTIFIER));
    }


    /**
     * Add an identifier to the service object.
     *
     * @param identifier
     *    an Identifier object
     */
    public final void addIdentifier(final Identifier identifier) {
        this.getElement().appendChild(identifier.getElement());
        this.identifiers.add(identifier);
    }


    /**
     * Obtain the identifiers for this service.
     *
     * @return
     *      A list of Identifier objects
     */
    public final List<Identifier> getIdentifiers() {
        return identifiers;
    }


    /**
     * Create and return an empty Name object.
     *
     * The returned object has no properties or content and is not part
     * of the RIF-CS document, it is essentially a constructor of an object
     * owned by the RIF-CS document. The returned object needs to be
     * "filled out" (e.g. with properties, additional sub-elements, etc)
     * before being added to the RIF-CS document.
     *
     * @return the new Name object
     *
     * @throws RIFCSException A RIFCSException
     *
     */
    public final Name newName() throws RIFCSException {
        return new Name(this.newElement(Constants.ELEMENT_NAME));
    }


    /**
     * Add a name to the service object.
     *
     * @param name
     *    a Name object
     */
    public final void addName(final Name name) {
        this.getElement().appendChild(name.getElement());
        this.names.add(name);
    }


    /**
     * Obtain the names for this service.
     *
     * @return
     *      A list of Name objects
     */
    public final List<Name> getNames() {
        return names;
    }


    /**
     * Create and return an empty Location object.
     *
     * The returned object has no properties or content and is not part
     * of the RIF-CS document, it is essentially a constructor of an object
     * owned by the RIF-CS document. The returned object needs to be
     * "filled out" (e.g. with properties, additional sub-elements, etc)
     * before being added to the RIF-CS document.
     *
     * @return the new Location object
     *
     * @throws RIFCSException A RIFCSException
     *
     */
    public final Location newLocation() throws RIFCSException {
        return new Location(this.newElement(Constants.ELEMENT_LOCATION));
    }


    /**
     * Add a location to the service object.
     *
     * @param location
     *    a Location object
     */
    public final void addLocation(final Location location) {
        this.getElement().appendChild(location.getElement());
        this.locations.add(location);
    }


    /**
     * Obtain the locations for this service.
     *
     * @return
     *      A list of Location objects
     */
    public final List<Location> getLocations() {
        return locations;
    }


    /**
     * Create and return an empty Coverage object.
     *
     * The returned object has no properties or content and is not part
     * of the RIF-CS document, it is essentially a constructor of an object
     * owned by the RIF-CS document. The returned object needs to be
     * "filled out" (e.g. with properties, additional sub-elements, etc)
     * before being added to the RIF-CS document.
     *
     * @return the new Coverage object
     *
     * @throws RIFCSException A RIFCSException
     *
     */
    public final Coverage newCoverage() throws RIFCSException {
        return new Coverage(this.newElement(Constants.ELEMENT_COVERAGE));
    }


    /**
     * Add a coverage element to the activity object.
     *
     * @param coverage
     *    a Coverage object
     */
    public final void addCoverage(final Coverage coverage) {
        this.getElement().appendChild(coverage.getElement());
        this.coverages.add(coverage);
    }


    /**
     * Obtain the coverage for this activity.
     *
     * @return
     *      A list of coverage objects
     */
    public final List<Coverage> getCoverage() {
        return coverages;
    }


    /**
     * Create and return an empty RelatedObject object.
     *
     * The returned object has no properties or content and is not part
     * of the RIF-CS document, it is essentially a constructor of an object
     * owned by the RIF-CS document. The returned object needs to be
     * "filled out" (e.g. with properties, additional sub-elements, etc)
     * before being added to the RIF-CS document.
     *
     * @return the new RelatedObject object
     *
     * @throws RIFCSException A RIFCSException
     *
     */
    public final RelatedObject newRelatedObject() throws RIFCSException {
        return new RelatedObject(this.newElement(
                Constants.ELEMENT_RELATED_OBJECT));
    }


    /**
     * Add a related object to the service object.
     *
     * @param relatedObject
     *    an RelatedObject object
     */
    public final void addRelatedObject(final RelatedObject relatedObject) {
        this.getElement().appendChild(relatedObject.getElement());
        this.relatedObjects.add(relatedObject);
    }


    /**
     * Obtain the related objects for this service.
     *
     * @return
     *      A list of RelatedObject objects
     */
    public final List<RelatedObject> getRelatedObjects() {
        return relatedObjects;
    }


    /**
     * Create and return an empty Subject object.
     *
     * The returned object has no properties or content and is not part
     * of the RIF-CS document, it is essentially a constructor of an object
     * owned by the RIF-CS document. The returned object needs to be
     * "filled out" (e.g. with properties, additional sub-elements, etc)
     * before being added to the RIF-CS document.
     *
     * @return the new Subject object
     *
     * @throws RIFCSException A RIFCSException
     *
     */
    public final Subject newSubject() throws RIFCSException {
        return new Subject(this.newElement(Constants.ELEMENT_SUBJECT));
    }


    /**
     * Add a subject to the service object.
     *
     * @param subject
     *    a Subject object
     */
    public final void addSubject(final Subject subject) {
        this.getElement().appendChild(subject.getElement());
        this.subjects.add(subject);
    }


    /**
     * Add a subject to the activity object.
     * @param value The value
     * @param type The type
     * @param termIdentifier The termIdentifier
     * @param lang The lang
     */
    public final void addSubject(final String value, final String type,
            final String termIdentifier, final String lang) {
        /*   if (subjects == null)
             {
             subjects = new ArrayList<Subject>();
             }

             type, termIdentifier, lang, value
        */
        Subject subject = null;
        try {
            subject = this.newSubject();
        } catch (RIFCSException e) {
            e.printStackTrace();
        }
        subject.setValue(value);
        subject.setType(type);
        subject.setTermIdentifier(termIdentifier);
        subject.setLanguage(lang);

        this.getElement().appendChild(subject.getElement());
        this.subjects.add(subject);
    }


    /**
     * Obtain the subjects for this service.
     *
     * @return
     *      A list of Subject objects
     */
    public final List<Subject> getSubjects() {
        return subjects;
    }


    /**
     * Create and return an empty Description object.
     *
     * The returned object has no properties or content and is not part
     * of the RIF-CS document, it is essentially a constructor of an object
     * owned by the RIF-CS document. The returned object needs to be
     * "filled out" (e.g. with properties, additional sub-elements, etc)
     * before being added to the RIF-CS document.
     *
     * @return the new Description object
     *
     * @throws RIFCSException A RIFCSException
     *
     */
    public final Description newDescription() throws RIFCSException {
        return new Description(this.newElement(Constants.ELEMENT_DESCRIPTION));
    }


    /**
     * Add a description to the service object.
     *
     * @param description
     *    a Description object
     */
    public final void addDescription(final Description description) {
        this.getElement().appendChild(description.getElement());
        this.descriptions.add(description);
    }


    /**
     * Convenience method to add a description to the collection object.
     *
     * @param description
     *            a description string
     * @param type
     *            the description type
     * @param language
     *            the description language or null
     *
     * @throws RIFCSException A RIFCSException
     */
    public final void addDescription(final String description,
            final String type, final String language) throws RIFCSException {
        Description d = newDescription();
        d.setType(type);
        d.setValue(description);
        if (language != null) {
            d.setLanguage(language);
        }
        this.getElement().appendChild(d.getElement());
        this.descriptions.add(d);
    }

    /**
     * Obtain the description for this service.
     *
     * @return
     *      A list of Description objects
     */
    public final List<Description> getDescriptions() {
        return descriptions;
    }

    /**
     * Create and return an empty Rights object.
     *
     * The returned object has no properties or content and is not part of the
     * RIF-CS document, it is essentially a constructor of an object owned by
     * the RIF-CS document. The returned object needs to be "filled out" (e.g.
     * with properties, additional sub-elements, etc) before being added to the
     * RIF-CS document.
     *
     * @return the new Rights object
     *
     * @throws RIFCSException A RIFCSException
     *
     */
    public final Rights newRights() throws RIFCSException {
        return new Rights(this.newElement(Constants.ELEMENT_RIGHTS));
    }


    /**
     * Add a rights element to the activity object.
     *
     * @param aRights
     *    a Rights object
     */
    public final void addRights(final Rights aRights) {
        /*    if (descriptions == null)
              {
              descriptions = new ArrayList<Description>();
              }
        */
        this.getElement().appendChild(aRights.getElement());
        this.rightsList.add(aRights);
    }


    /**
     * Obtain the description for this activity.
     *
     * @return
     *      A list of Description objects
     */
    public final List<Rights> getRights() {
        return rightsList;
    }



    /**
     * Create and return an empty ExistenceDates object.
     *
     * The returned object has no properties or content and is not part
     * of the RIF-CS document, it is essentially a constructor of an object
     * owned by the RIF-CS document. The returned object needs to be
     * "filled out" (e.g. with properties, additional sub-elements, etc)
     * before being added to the RIF-CS document.
     *
     * @return the new ExistenceDates object
     *
     * @throws RIFCSException A RIFCSException
     *
     */
    public final ExistenceDates newExistenceDate() throws RIFCSException {
        return new ExistenceDates(this.newElement(
                Constants.ELEMENT_EXISTENCE_DATES));
    }


    /**
     * Add an existence dates element to the activity object.
     *
     * @param anExistenceDates
     *    an ExistenceDates object
     */
    public final void addExistenceDates(final ExistenceDates anExistenceDates) {
        /*    if (descriptions == null)
              {
              descriptions = new ArrayList<Description>();
              }
        */
        this.getElement().appendChild(anExistenceDates.getElement());
        this.existenceDates.add(anExistenceDates);
    }


    /**
     * Add an existence dates element to the activity object.
     * @param startVal The start date
     * @param startDateFormat The start date format
     * @param endVal The end date
     * @param endDateFormat The end date format
     */
    public final void addExistenceDates(final String startVal,
            final String startDateFormat, final String endVal,
            final String endDateFormat) {
        /*    if (descriptions == null)
              {
              descriptions = new ArrayList<Description>();
              }
        */
        ExistenceDates date;
        try {
            date = this.newExistenceDate();
            date.setStartDate(startVal, startDateFormat);
            date.setEndDate(endVal, endDateFormat);
            this.getElement().appendChild(date.getElement());
            this.existenceDates.add(date);
        } catch (RIFCSException e) {
            e.printStackTrace();
        }
    }

    /**
     * Obtain the description for this activity.
     *
     * @return
     *      A list of Description objects
     */
    public final List<ExistenceDates> getExistenceDates() {
        return existenceDates;
    }



    /**
     * Create and return an empty AccessPolicy object.
     *
     * The returned object has no properties or content and is not part
     * of the RIF-CS document, it is essentially a constructor of an object
     * owned by the RIF-CS document. The returned object needs to be
     * "filled out" (e.g. with properties, additional sub-elements, etc)
     * before being added to the RIF-CS document.
     *
     * @return the new AccessPolicy object
     *
     * @throws RIFCSException A RIFCSException
     *
     */
    public final AccessPolicy newAccessPolicy() throws RIFCSException {
        return new AccessPolicy(this.newElement(
                Constants.ELEMENT_ACCESS_POLICY));
    }


    /**
     * Add an access policy to the service object.
     *
     * @param accessPolicy
     *    an AccessPolicy object
     */
    public final void addAccessPolicy(final AccessPolicy accessPolicy) {
        this.getElement().appendChild(accessPolicy.getElement());
        this.aps.add(accessPolicy);
    }

    /**
     * Add an access policy to the service object.
     *
     * @param accessPolicyVal
     *    the name of an AccessPolicy
     */
    public final void addAccessPolicy(final String accessPolicyVal) {
        AccessPolicy policy = null;
        try {
            policy = this.newAccessPolicy();
        } catch (RIFCSException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        policy.setValue(accessPolicyVal);
        this.getElement().appendChild(policy.getElement());
        this.aps.add(policy);
    }

    /**
     * Obtain the access policies for this service.
     *
     * @return
     *      A list of AccessPolicy objects
     */
    public final List<AccessPolicy> getAccessPolicies() {
        return aps;
    }


    /**
     * Create and return an empty RelatedInfo object.
     *
     * The returned object has no properties or content and is not part
     * of the RIF-CS document, it is essentially a constructor of an object
     * owned by the RIF-CS document. The returned object needs to be
     * "filled out" (e.g. with properties, additional sub-elements, etc)
     * before being added to the RIF-CS document.
     *
     * @return the new RelatedInfo object
     *
     * @throws RIFCSException A RIFCSException
     *
     */
    public final RelatedInfo newRelatedInfo() throws RIFCSException {
        return new RelatedInfo(this.newElement(
                Constants.ELEMENT_RELATED_INFO));
    }


    /**
     * Add related info to the service object.
     *
     * @param relatedInfo
     *    a relatedInfo object
     */
    public final void addRelatedInfo(final RelatedInfo relatedInfo) {
        this.getElement().appendChild(relatedInfo.getElement());
        this.ris.add(relatedInfo);
    }


    /**
     * Obtain the related info for this service.
     *
     * @return
     *      A list of RelatedInfo objects
     */
    public final List<RelatedInfo> getRelatedInfo() {
        return ris;
    }


    /** Initialisation code for existing documents. A wrapper that
     *  invokes initIdentifiers(), initNames(), etc., in turn.
     *
     * @throws RIFCSException A RIFCSException
     *
     */
    private void initStructures() throws RIFCSException {
        initIdentifiers();
        initNames();
        initLocations();
        initCoverage();
        initRelatedObjects();
        initSubjects();
        initDescriptions();
        initRelatedInfo();
        initAccessPolicies();
        initRights();
        initExistenceDates();
    }

    /** Initialisation code for identifier elements.
     *
     * @throws RIFCSException A RIFCSException
     *
     */
    private void initIdentifiers() throws RIFCSException {
        NodeList nl = super.getElements(Constants.ELEMENT_IDENTIFIER);

        for (int i = 0; i < nl.getLength(); i++) {
            identifiers.add(new Identifier(nl.item(i)));
        }
    }

    /** Initialisation code for name elements.
     *
     * @throws RIFCSException A RIFCSException
     *
     */
    private void initNames() throws RIFCSException {
        NodeList nl = super.getElements(Constants.ELEMENT_NAME);

        for (int i = 0; i < nl.getLength(); i++) {
            names.add(new Name(nl.item(i)));
        }
    }

    /** Initialisation code for location elements.
     *
     * @throws RIFCSException A RIFCSException
     *
     */
    private void initLocations() throws RIFCSException {
        NodeList nl = super.getElements(Constants.ELEMENT_LOCATION);

        for (int i = 0; i < nl.getLength(); i++) {
            locations.add(new Location(nl.item(i)));
        }
    }

    /** Initialisation code for coverage elements.
     *
     * @throws RIFCSException A RIFCSException
     *
     */
    private void initCoverage() throws RIFCSException {
        NodeList nl = super.getElements(Constants.ELEMENT_COVERAGE);

        for (int i = 0; i < nl.getLength(); i++) {
            coverages.add(new Coverage(nl.item(i)));
        }
    }

    /** Initialisation code for relatedObject elements.
     *
     * @throws RIFCSException A RIFCSException
     *
     */
    private void initRelatedObjects() throws RIFCSException {
        NodeList nl = super.getElements(Constants.ELEMENT_RELATED_OBJECT);

        for (int i = 0; i < nl.getLength(); i++) {
            relatedObjects.add(new RelatedObject(nl.item(i)));
        }
    }

    /** Initialisation code for subject elements.
     *
     * @throws RIFCSException A RIFCSException
     *
     */
    private void initSubjects() throws RIFCSException {
        NodeList nl = super.getElements(Constants.ELEMENT_SUBJECT);

        for (int i = 0; i < nl.getLength(); i++) {
            subjects.add(new Subject(nl.item(i)));
        }
    }

    /** Initialisation code for description elements.
     *
     * @throws RIFCSException A RIFCSException
     *
     */
    private void initDescriptions() throws RIFCSException {
        NodeList nl = super.getElements(Constants.ELEMENT_DESCRIPTION);

        for (int i = 0; i < nl.getLength(); i++) {
            descriptions.add(new Description(nl.item(i)));
        }
    }

    /** Initialisation code for relatedInfo elements.
     *
     * @throws RIFCSException A RIFCSException
     *
     */
    private void initRelatedInfo() throws RIFCSException {
        NodeList nl = super.getElements(Constants.ELEMENT_RELATED_INFO);

        for (int i = 0; i < nl.getLength(); i++) {
            ris.add(new RelatedInfo(nl.item(i)));
        }
    }

    /** Initialisation code for accessPolicy elements.
     *
     * @throws RIFCSException A RIFCSException
     *
     */
    private void initAccessPolicies() throws RIFCSException {
        NodeList nl = super.getElements(Constants.ELEMENT_ACCESS_POLICY);

        for (int i = 0; i < nl.getLength(); i++) {
            aps.add(new AccessPolicy(nl.item(i)));
        }
    }

    /** Initialisation code for rights elements.
    *
    * @throws RIFCSException A RIFCSException
    *
    */
   private void initRights() throws RIFCSException {
       NodeList nl = super.getElements(Constants.ELEMENT_RIGHTS);

       for (int i = 0; i < nl.getLength(); i++) {
           rightsList.add(new Rights(nl.item(i)));
       }
   }

   /** Initialisation code for existenceDates elements.
   *
   * @throws RIFCSException A RIFCSException
   *
   */
  private void initExistenceDates() throws RIFCSException {
      NodeList nl = super.getElements(Constants.ELEMENT_EXISTENCE_DATES);

      for (int i = 0; i < nl.getLength(); i++) {
          existenceDates.add(new ExistenceDates(nl.item(i)));
      }
  }

}
