package cases;
import riconeapi.common.Authenticator;
import riconeapi.common.Util;
import riconeapi.common.XPress;
import riconeapi.models.authentication.Endpoint;
import riconeapi.models.xpress.XCalendarType;
import riconeapi.models.xpress.XContactStudentRelationshipType;
import riconeapi.models.xpress.XContactType;
import riconeapi.models.xpress.XCourseType;
import riconeapi.models.xpress.XEmailType;
import riconeapi.models.xpress.XEnrollmentType;
import riconeapi.models.xpress.XLanguageType;
import riconeapi.models.xpress.XLeaType;
import riconeapi.models.xpress.XMeetingTimeType;
import riconeapi.models.xpress.XOtherCourseIdType;
import riconeapi.models.xpress.XOtherOrganizationIdType;
import riconeapi.models.xpress.XOtherPersonIdType;
import riconeapi.models.xpress.XPersonNameType;
import riconeapi.models.xpress.XPersonReferenceType;
import riconeapi.models.xpress.XRaceType;
import riconeapi.models.xpress.XRosterType;
import riconeapi.models.xpress.XSchoolType;
import riconeapi.models.xpress.XSessionType;
import riconeapi.models.xpress.XStaffPersonAssignmentType;
import riconeapi.models.xpress.XStaffReferenceType;
import riconeapi.models.xpress.XStaffType;
import riconeapi.models.xpress.XStudentType;
import riconeapi.models.xpress.XTelephoneType;

/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.3.1
 * @since       Jul 20, 2016
 * @filename	RicOneApiTestsPaging.java
 */

public class RicOneApiTestsPaging
{
	// Test Constants
	final static String authUrl = "http://auth.test.ricone.org/login";
	final static String clientId = "dpademo";
	final static String clientSecret = "deecd889bff5ed0101a86680752f5f9";

	final static String providerId = "workshop";
	static int navigationPageSize = 10;
//	static int navigationPageSize = 50;
//	static int navigationPageSize = 100;
    
	// Null:
	static String refId = null;
    // Lea:
//	static String refId = "1098EFC6-5374-4D7D-AEAE-58E021CCB146";
//  static String refId = "8DC360AF-5FC2-465C-94E4-EB9596F3F7C4";
    // School:
//	static String refId = "0F4DE8DE-5AA3-48A7-A330-62E0B8910F1C";
//	static String refId = "BAC59C6E-D8DD-4E21-938A-13A80E555B7E";
//	static String refId = "106E9449-3FF4-499E-B94F-BCE557C013CE";
    // Calendar:
//	static String refId = "0451AF50-40BA-4231-8656-AE4C28AF7426";
    // Course:
//	static String refId = "A985F5AF-2139-4C5C-B253-00AEE896259E";
//	static String refId = "01810477-3494-4EE8-87C7-19BE2BBDC524";
    // Roster:
//	static String refId = "9AEF7446-1B9F-4C2A-A7FF-0058C51C0E5F";
//	static String refId = "93C3E007-D29E-4096-A58C-645C620EC9B9";
    //	 Staff:
//	static String refId = "DDB25022-B78E-4C89-9A59-AE877E03CFE3";
//	static String refId = "190C1A4B-AD63-469B-BF2B-9673C8AC312A";
	//Student:
//	static String refId = "4C4A57D5-ED2F-4AFC-8C20-2A309989ED71";
//	static String refId = "62DF00BD-6A5A-4FE9-AD17-9A03189DAEA5";
//	static String refId = "87B0AA0D-020A-4E0C-9010-AC1F4E315C74";
    // Contact 1:
//	static String refId = "F0BED6E9-8636-4BB3-8295-778D8930B2A1";
	
	public static void main(String[] args)
	{   	
		Util.disableSslVerification();
		Authenticator auth = Authenticator.getInstance();
		auth.authenticate(authUrl, clientId, clientSecret);
		
		for (Endpoint e : auth.getEndpoints(providerId))
		{
			XPress xPress = new XPress(e.getHref());

			// #################### navigatonLastPage ####################
			// xLeas
//			XLeas_GetXLeasLastPage(ricOne);
//			XLeas_GetXLeasByXSchoolLastPage(ricOne);
//			XLeas_GetXLeasByXRosterLastPage(ricOne);
//			XLeas_GetXLeasByXStaffLastPage(ricOne);
//			XLeas_GetXLeasByXStudentLastPage(ricOne);
//			XLeas_GetXLeasByXContactLastPage(ricOne);

			// xSchools
//			XSchools_GetXSchoolsLastPage(ricOne);
//			XSchools_GetXSchoolsByXLeaLastPage(ricOne);
//			XSchools_GetXSchoolsByXCalendarLastPage(ricOne);
//			XSchools_GetXSchoolsByXCourseLastPage(ricOne);
//			XSchools_GetXSchoolsByXRosterLastPage(ricOne);
//			XSchools_GetXSchoolsByXStaffLastPage(ricOne);
//			XSchools_GetXSchoolsByXStudentLastPage(ricOne);
//			XSchools_GetXSchoolsByXContactLastPage(ricOne);

			// xCalendars
//			XCalendars_GetXCalendarsLastPage(ricOne);
//			XCalendars_GetXCalendarsByXLeaLastPage(ricOne);
//			XCalendars_GetXCalendarsByXSchoolLastPage(ricOne);

			// xCourses
//			XCourses_GetXCoursesLastPage(ricOne);
//			XCourses_GetXCoursesByXLeaLastPage(ricOne);
//			XCourses_GetXCoursesByXSchoolLastPage(ricOne);
//			XCourses_GetXCoursesByXRosterLastPage(ricOne);

			// xRosters
//			XRosters_GetXRostersLastPage(ricOne);
//			XRosters_GetXRostersByXLeaLastPage(ricOne);
//			XRosters_GetXRostersByXSchoolLastPage(ricOne);
//			XRosters_GetXRostersByXCourseLastPage(ricOne);
//			XRosters_GetXRostersByXStaffLastPage(ricOne);
//			XRosters_GetXRostersByXStudentLastPage(ricOne);

			// xStaffs
//			XStaffs_GetXStaffsLastPage(ricOne);
//			XStaffs_GetXStaffsByXLeaLastPage(ricOne);
//			XStaffs_GetXStaffsByXSchoolLastPage(ricOne);
//			XStaffs_GetXStaffsByXCourseLastPage(ricOne);
//			XStaffs_GetXStaffsByXRosterLastPage(ricOne);
//			XStaffs_GetXStaffsByXStudentLastPage(ricOne);

			// xStudents
//			XStudents_GetXStudentsLastPage(ricOne);
//			XStudents_GetXStudentsByXLeaLastPage(ricOne);
//			XStudents_GetXStudentsByXSchoolLastPage(ricOne);
//			XStudents_GetXStudentsByXRosterLastPage(ricOne);
//			XStudents_GetXStudentsByXStaffLastPage(ricOne);
//			XStudents_GetXStudentsByXContactLastPage(ricOne);

			// xContacts
//			XContacts_GetXSContactsLastPage(ricOne);
//			XContacts_GetXContactsByXLeaLastPage(ricOne);
//			XContacts_GetXContactsByXSchoolLastPage(ricOne);
//			XContacts_GetXContactsByXStudentLastPage(ricOne);
		}

	}
	
 // #################### navigatonLastPage ####################
	// #################### xLeas ####################
	//RETURN ALL LEAS
	public static void XLeas_GetXLeasLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXLEAS); i++)
		{
			for (XLeaType lea : xPress.getXLeas().getData())
			{

				System.out.println("refId: " + lea.getRefId());
				System.out.println("leaName: " + lea.getLeaName());
				System.out.println("leaRefId: " + lea.getLeaRefId());
				System.out.println("localId: " + lea.getLocalId());
				System.out.println("ncesId: " + lea.getNcesId());
				System.out.println("stateProvinceId: " + lea.getStateProvinceId());

				System.out.println("##### BEGIN ADDRESS #####");
				System.out.println("addressType: " + lea.getAddress().getAddressType());
				System.out.println("city: " + lea.getAddress().getCity());
				System.out.println("line1: " + lea.getAddress().getLine1());
				System.out.println("line2: " + lea.getAddress().getLine2());
				System.out.println("countryCode: " + lea.getAddress().getCountryCode());
				System.out.println("postalCode: " + lea.getAddress().getPostalCode());
				System.out.println("stateProvince: " + lea.getAddress().getStateProvince());
				System.out.println("##### END ADDRESS #####");

				System.out.println("##### BEGIN PHONENUMBER #####");
				System.out.println("number: " + lea.getPhoneNumber().getNumber());
				System.out.println("phoneNumberType: " + lea.getPhoneNumber().getPhoneNumberType());
				System.out.println("primaryIndicator: " + lea.getPhoneNumber().isPrimaryIndicator());
				System.out.println("##### END PHONENUMBER #####");

				System.out.println("##### BEGIN OTHERPHONENUMBER #####");

				for (XTelephoneType p : lea.getOtherPhoneNumbers().getPhoneNumber())
				{
					System.out.println("number: " + p.getNumber());
					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
				}
				System.out.println("##### END OTHERPHONENUMBER #####");

				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}

	// RETURN LEAS BY SCHOOL
	public static void XLeas_GetXLeasByXSchoolLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXLEASBYXSCHOOL, refId); i++)
		{
			for (XLeaType lea : xPress.getXLeasByXSchool(refId).getData())
			{
				System.out.println("refId: " + lea.getRefId());
				System.out.println("leaName: " + lea.getLeaName());
				System.out.println("leaRefId: " + lea.getLeaRefId());
				System.out.println("localId: " + lea.getLocalId());
				System.out.println("ncesId: " + lea.getNcesId());
				System.out.println("stateProvinceId: " + lea.getStateProvinceId());

				System.out.println("##### BEGIN ADDRESS #####");
				System.out.println("addressType: " + lea.getAddress().getAddressType());
				System.out.println("city: " + lea.getAddress().getCity());
				System.out.println("line1: " + lea.getAddress().getLine1());
				System.out.println("line2: " + lea.getAddress().getLine2());
				System.out.println("countryCode: " + lea.getAddress().getCountryCode());
				System.out.println("postalCode: " + lea.getAddress().getPostalCode());
				System.out.println("stateProvince: " + lea.getAddress().getStateProvince());
				System.out.println("##### END ADDRESS #####");

				System.out.println("##### BEGIN PHONENUMBER #####");
				System.out.println("number: " + lea.getPhoneNumber().getNumber());
				System.out.println("phoneNumberType: " + lea.getPhoneNumber().getPhoneNumberType());
				System.out.println("primaryIndicator: " + lea.getPhoneNumber().isPrimaryIndicator());
				System.out.println("##### END PHONENUMBER #####");

				System.out.println("##### BEGIN OTHERPHONENUMBER #####");

				for (XTelephoneType p : lea.getOtherPhoneNumbers().getPhoneNumber())
				{
					System.out.println("number: " + p.getNumber());
					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
				}
				System.out.println("##### END OTHERPHONENUMBER #####");

				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}
	// RETURN LEAS BY SCHOOL
	public static void XLeas_GetXLeasByXRosterLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXLEASBYXROSTER, refId); i++)
		{
			for (XLeaType lea : xPress.getXLeasByXRoster(refId).getData())
			{
				System.out.println("refId: " + lea.getRefId());
				System.out.println("leaName: " + lea.getLeaName());
				System.out.println("leaRefId: " + lea.getLeaRefId());
				System.out.println("localId: " + lea.getLocalId());
				System.out.println("ncesId: " + lea.getNcesId());
				System.out.println("stateProvinceId: " + lea.getStateProvinceId());

				System.out.println("##### BEGIN ADDRESS #####");
				System.out.println("addressType: " + lea.getAddress().getAddressType());
				System.out.println("city: " + lea.getAddress().getCity());
				System.out.println("line1: " + lea.getAddress().getLine1());
				System.out.println("line2: " + lea.getAddress().getLine2());
				System.out.println("countryCode: " + lea.getAddress().getCountryCode());
				System.out.println("postalCode: " + lea.getAddress().getPostalCode());
				System.out.println("stateProvince: " + lea.getAddress().getStateProvince());
				System.out.println("##### END ADDRESS #####");

				System.out.println("##### BEGIN PHONENUMBER #####");
				System.out.println("number: " + lea.getPhoneNumber().getNumber());
				System.out.println("phoneNumberType: " + lea.getPhoneNumber().getPhoneNumberType());
				System.out.println("primaryIndicator: " + lea.getPhoneNumber().isPrimaryIndicator());
				System.out.println("##### END PHONENUMBER #####");

				System.out.println("##### BEGIN OTHERPHONENUMBER #####");

				for (XTelephoneType p : lea.getOtherPhoneNumbers().getPhoneNumber())
				{
					System.out.println("number: " + p.getNumber());
					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
				}
				System.out.println("##### END OTHERPHONENUMBER #####");

				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}
	// RETURN LEAS BY STAFF
	public static void XLeas_GetXLeasByXStaffLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXLEASBYXSTAFF, refId); i++)
		{
			for (XLeaType lea : xPress.getXLeasByXStaff(refId).getData())
			{
				System.out.println("refId: " + lea.getRefId());
				System.out.println("leaName: " + lea.getLeaName());
				System.out.println("leaRefId: " + lea.getLeaRefId());
				System.out.println("localId: " + lea.getLocalId());
				System.out.println("ncesId: " + lea.getNcesId());
				System.out.println("stateProvinceId: " + lea.getStateProvinceId());

				System.out.println("##### BEGIN ADDRESS #####");
				System.out.println("addressType: " + lea.getAddress().getAddressType());
				System.out.println("city: " + lea.getAddress().getCity());
				System.out.println("line1: " + lea.getAddress().getLine1());
				System.out.println("line2: " + lea.getAddress().getLine2());
				System.out.println("countryCode: " + lea.getAddress().getCountryCode());
				System.out.println("postalCode: " + lea.getAddress().getPostalCode());
				System.out.println("stateProvince: " + lea.getAddress().getStateProvince());
				System.out.println("##### END ADDRESS #####");

				System.out.println("##### BEGIN PHONENUMBER #####");
				System.out.println("number: " + lea.getPhoneNumber().getNumber());
				System.out.println("phoneNumberType: " + lea.getPhoneNumber().getPhoneNumberType());
				System.out.println("primaryIndicator: " + lea.getPhoneNumber().isPrimaryIndicator());
				System.out.println("##### END PHONENUMBER #####");

				System.out.println("##### BEGIN OTHERPHONENUMBER #####");

				for (XTelephoneType p : lea.getOtherPhoneNumbers().getPhoneNumber())
				{
					System.out.println("number: " + p.getNumber());
					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
				}
				System.out.println("##### END OTHERPHONENUMBER #####");

				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}

	// RETURN LEAS BY STUDENT
	public static void XLeas_GetXLeasByXStudentLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXLEASBYXSTUDENT, refId); i++)
		{
			for (XLeaType lea : xPress.getXLeasByXStudent(refId).getData())
			{
				System.out.println("refId: " + lea.getRefId());
				System.out.println("leaName: " + lea.getLeaName());
				System.out.println("leaRefId: " + lea.getLeaRefId());
				System.out.println("localId: " + lea.getLocalId());
				System.out.println("ncesId: " + lea.getNcesId());
				System.out.println("stateProvinceId: " + lea.getStateProvinceId());

				System.out.println("##### BEGIN ADDRESS #####");
				System.out.println("addressType: " + lea.getAddress().getAddressType());
				System.out.println("city: " + lea.getAddress().getCity());
				System.out.println("line1: " + lea.getAddress().getLine1());
				System.out.println("line2: " + lea.getAddress().getLine2());
				System.out.println("countryCode: " + lea.getAddress().getCountryCode());
				System.out.println("postalCode: " + lea.getAddress().getPostalCode());
				System.out.println("stateProvince: " + lea.getAddress().getStateProvince());
				System.out.println("##### END ADDRESS #####");

				System.out.println("##### BEGIN PHONENUMBER #####");
				System.out.println("number: " + lea.getPhoneNumber().getNumber());
				System.out.println("phoneNumberType: " + lea.getPhoneNumber().getPhoneNumberType());
				System.out.println("primaryIndicator: " + lea.getPhoneNumber().isPrimaryIndicator());
				System.out.println("##### END PHONENUMBER #####");

				System.out.println("##### BEGIN OTHERPHONENUMBER #####");

				for (XTelephoneType p : lea.getOtherPhoneNumbers().getPhoneNumber())
				{
					System.out.println("number: " + p.getNumber());
					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
				}
				System.out.println("##### END OTHERPHONENUMBER #####");

				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}

	// RETURN LEAS BY CONTACT
	public static void XLeas_GetXLeasByXContactLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXLEASBYXCONTACT, refId); i++)
		{
			for (XLeaType lea : xPress.getXLeasByXContact(refId).getData())
			{
				System.out.println("refId: " + lea.getRefId());
				System.out.println("leaName: " + lea.getLeaName());
				System.out.println("leaRefId: " + lea.getLeaRefId());
				System.out.println("localId: " + lea.getLocalId());
				System.out.println("ncesId: " + lea.getNcesId());
				System.out.println("stateProvinceId: " + lea.getStateProvinceId());

				System.out.println("##### BEGIN ADDRESS #####");
				System.out.println("addressType: " + lea.getAddress().getAddressType());
				System.out.println("city: " + lea.getAddress().getCity());
				System.out.println("line1: " + lea.getAddress().getLine1());
				System.out.println("line2: " + lea.getAddress().getLine2());
				System.out.println("countryCode: " + lea.getAddress().getCountryCode());
				System.out.println("postalCode: " + lea.getAddress().getPostalCode());
				System.out.println("stateProvince: " + lea.getAddress().getStateProvince());
				System.out.println("##### END ADDRESS #####");

				System.out.println("##### BEGIN PHONENUMBER #####");
				System.out.println("number: " + lea.getPhoneNumber().getNumber());
				System.out.println("phoneNumberType: " + lea.getPhoneNumber().getPhoneNumberType());
				System.out.println("primaryIndicator: " + lea.getPhoneNumber().isPrimaryIndicator());
				System.out.println("##### END PHONENUMBER #####");

				System.out.println("##### BEGIN OTHERPHONENUMBER #####");

				for (XTelephoneType p : lea.getOtherPhoneNumbers().getPhoneNumber())
				{
					System.out.println("number: " + p.getNumber());
					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
				}
				System.out.println("##### END OTHERPHONENUMBER #####");

				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}
    
    // #################### xSchools ####################
	// RETURN ALL SCHOOLS
	public static void XSchools_GetXSchoolsLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXSCHOOLS); i++)
		{
			for (XSchoolType school : xPress.getXSchools().getData())
			{
				System.out.println("refId: " + school.getRefId());
				System.out.println("leaRefId: " + school.getRefId());
				System.out.println("localId: " + school.getLocalId());
				System.out.println("stateProvinceId: " + school.getStateProvinceId());
				System.out.println("##### BEGIN OTHERIDS #####");
				for (XOtherOrganizationIdType id : school.getOtherIds().getOtherId())
				{
					System.out.println("otherId id" + id.getId());
					System.out.println("type: " + id.getType());
				}
				System.out.println("##### END OTHERIDS #####");
				System.out.println("schoolName: " + school.getSchoolName());
				System.out.println("##### BEGIN GRADELEVELS #####");
				for (String gl : school.getGradeLevels().getGradeLevel())
				{
					System.out.println("gradeLevel: " + gl);
				}
				System.out.println("##### END GRADELEVELS #####");
				System.out.println("##### BEGIN ADDRESS #####");
				System.out.println("addressType: " + school.getAddress().getAddressType());
				System.out.println("city: " + school.getAddress().getCity());
				System.out.println("line1: " + school.getAddress().getLine1());
				System.out.println("line2: " + school.getAddress().getLine2());
				System.out.println("countryCode: " + school.getAddress().getCountryCode());
				System.out.println("postalCode: " + school.getAddress().getPostalCode());
				System.out.println("stateProvince: " + school.getAddress().getStateProvince());
				System.out.println("##### END ADDRESS #####");
				System.out.println("##### BEGIN PHONENUMBER #####");
				System.out.println("number: " + school.getPhoneNumber().getNumber());
				System.out.println("phoneNumberType: " + school.getPhoneNumber().getPhoneNumberType());
				System.out.println("primaryIndicator: " + school.getPhoneNumber().isPrimaryIndicator());
				System.out.println("##### END PHONENUMBER #####");
				System.out.println("##### BEGIN OTHERPHONENUMBER #####");
				for (XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber())
				{
					System.out.println("otherPhoneNumbers number: " + p.getNumber());
					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
				}
				System.out.println("##### END OTHERPHONENUMBER #####");
				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}

	// RETURN SCHOOLS BY LEA
	public static void XSchools_GetXSchoolsByXLeaLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXSCHOOLSBYXLEA, refId); i++)
		{
			for (XSchoolType school : xPress.getXSchoolsByXLea(refId).getData())
			{
				System.out.println("refId: " + school.getRefId());
				System.out.println("leaRefId: " + school.getRefId());
				System.out.println("localId: " + school.getLocalId());
				System.out.println("stateProvinceId: " + school.getStateProvinceId());
				System.out.println("##### BEGIN OTHERIDS #####");
				for (XOtherOrganizationIdType id : school.getOtherIds().getOtherId())
				{
					System.out.println("otherId id" + id.getId());
					System.out.println("type: " + id.getType());
				}
				System.out.println("##### END OTHERIDS #####");
				System.out.println("schoolName: " + school.getSchoolName());
				System.out.println("##### BEGIN GRADELEVELS #####");
				for (String gl : school.getGradeLevels().getGradeLevel())
				{
					System.out.println("gradeLevel: " + gl);
				}
				System.out.println("##### END GRADELEVELS #####");
				System.out.println("##### BEGIN ADDRESS #####");
				System.out.println("addressType: " + school.getAddress().getAddressType());
				System.out.println("city: " + school.getAddress().getCity());
				System.out.println("line1: " + school.getAddress().getLine1());
				System.out.println("line2: " + school.getAddress().getLine2());
				System.out.println("countryCode: " + school.getAddress().getCountryCode());
				System.out.println("postalCode: " + school.getAddress().getPostalCode());
				System.out.println("stateProvince: " + school.getAddress().getStateProvince());
				System.out.println("##### END ADDRESS #####");
				System.out.println("##### BEGIN PHONENUMBER #####");
				System.out.println("number: " + school.getPhoneNumber().getNumber());
				System.out.println("phoneNumberType: " + school.getPhoneNumber().getPhoneNumberType());
				System.out.println("primaryIndicator: " + school.getPhoneNumber().isPrimaryIndicator());
				System.out.println("##### END PHONENUMBER #####");
				System.out.println("##### BEGIN OTHERPHONENUMBER #####");
				for (XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber())
				{
					System.out.println("otherPhoneNumbers number: " + p.getNumber());
					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
				}
				System.out.println("##### END OTHERPHONENUMBER #####");
				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}

	// RETURN SCHOOLS BY CALENDAR
	public static void XSchools_GetXSchoolsByXCalendarLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXSCHOOLSBYXCALENDAR, refId); i++)
		{
			for (XSchoolType school : xPress.getXSchoolsByXCalendar(refId).getData())
			{
				System.out.println("refId: " + school.getRefId());
				System.out.println("leaRefId: " + school.getRefId());
				System.out.println("localId: " + school.getLocalId());
				System.out.println("stateProvinceId: " + school.getStateProvinceId());
				System.out.println("##### BEGIN OTHERIDS #####");
				for (XOtherOrganizationIdType id : school.getOtherIds().getOtherId())
				{
					System.out.println("otherId id" + id.getId());
					System.out.println("type: " + id.getType());
				}
				System.out.println("##### END OTHERIDS #####");
				System.out.println("schoolName: " + school.getSchoolName());
				System.out.println("##### BEGIN GRADELEVELS #####");
				for (String gl : school.getGradeLevels().getGradeLevel())
				{
					System.out.println("gradeLevel: " + gl);
				}
				System.out.println("##### END GRADELEVELS #####");
				System.out.println("##### BEGIN ADDRESS #####");
				System.out.println("addressType: " + school.getAddress().getAddressType());
				System.out.println("city: " + school.getAddress().getCity());
				System.out.println("line1: " + school.getAddress().getLine1());
				System.out.println("line2: " + school.getAddress().getLine2());
				System.out.println("countryCode: " + school.getAddress().getCountryCode());
				System.out.println("postalCode: " + school.getAddress().getPostalCode());
				System.out.println("stateProvince: " + school.getAddress().getStateProvince());
				System.out.println("##### END ADDRESS #####");
				System.out.println("##### BEGIN PHONENUMBER #####");
				System.out.println("number: " + school.getPhoneNumber().getNumber());
				System.out.println("phoneNumberType: " + school.getPhoneNumber().getPhoneNumberType());
				System.out.println("primaryIndicator: " + school.getPhoneNumber().isPrimaryIndicator());
				System.out.println("##### END PHONENUMBER #####");
				System.out.println("##### BEGIN OTHERPHONENUMBER #####");
				for (XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber())
				{
					System.out.println("otherPhoneNumbers number: " + p.getNumber());
					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
				}
				System.out.println("##### END OTHERPHONENUMBER #####");
				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}

	// RETURN SCHOOLS BY COURSE
	public static void XSchools_GetXSchoolsByXCourseLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXSCHOOLSBYXCOURSE, refId); i++)
		{
			for (XSchoolType school : xPress.getXSchoolsByXCourse(refId).getData())
			{
				System.out.println("refId: " + school.getRefId());
				System.out.println("leaRefId: " + school.getRefId());
				System.out.println("localId: " + school.getLocalId());
				System.out.println("stateProvinceId: " + school.getStateProvinceId());
				System.out.println("##### BEGIN OTHERIDS #####");
				for (XOtherOrganizationIdType id : school.getOtherIds().getOtherId())
				{
					System.out.println("otherId id" + id.getId());
					System.out.println("type: " + id.getType());
				}
				System.out.println("##### END OTHERIDS #####");
				System.out.println("schoolName: " + school.getSchoolName());
				System.out.println("##### BEGIN GRADELEVELS #####");
				for (String gl : school.getGradeLevels().getGradeLevel())
				{
					System.out.println("yearGroup: " + gl);
				}
				System.out.println("##### END GRADELEVELS #####");
				System.out.println("##### BEGIN ADDRESS #####");
				System.out.println("addressType: " + school.getAddress().getAddressType());
				System.out.println("city: " + school.getAddress().getCity());
				System.out.println("line1: " + school.getAddress().getLine1());
				System.out.println("line2: " + school.getAddress().getLine2());
				System.out.println("countryCode: " + school.getAddress().getCountryCode());
				System.out.println("postalCode: " + school.getAddress().getPostalCode());
				System.out.println("stateProvince: " + school.getAddress().getStateProvince());
				System.out.println("##### END ADDRESS #####");
				System.out.println("##### BEGIN PHONENUMBER #####");
				System.out.println("number: " + school.getPhoneNumber().getNumber());
				System.out.println("phoneNumberType: " + school.getPhoneNumber().getPhoneNumberType());
				System.out.println("primaryIndicator: " + school.getPhoneNumber().isPrimaryIndicator());
				System.out.println("##### END PHONENUMBER #####");
				System.out.println("##### BEGIN OTHERPHONENUMBER #####");
				for (XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber())
				{
					System.out.println("otherPhoneNumbers number: " + p.getNumber());
					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
				}
				System.out.println("##### END OTHERPHONENUMBER #####");
				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}

	// RETURN SCHOOLS BY ROSTER
	public static void XSchools_GetXSchoolsByXRosterLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXSCHOOLSBYXROSTER, refId); i++)
		{
			for (XSchoolType school : xPress.getXSchoolsByXRoster(refId).getData())
			{
				System.out.println("refId: " + school.getRefId());
				System.out.println("leaRefId: " + school.getRefId());
				System.out.println("localId: " + school.getLocalId());
				System.out.println("stateProvinceId: " + school.getStateProvinceId());
				System.out.println("##### BEGIN OTHERIDS #####");
				for (XOtherOrganizationIdType id : school.getOtherIds().getOtherId())
				{
					System.out.println("otherId id" + id.getId());
					System.out.println("type: " + id.getType());
				}
				System.out.println("##### END OTHERIDS #####");
				System.out.println("schoolName: " + school.getSchoolName());
				System.out.println("##### BEGIN GRADELEVELS #####");
				for (String gl : school.getGradeLevels().getGradeLevel())
				{
					System.out.println("gradeLevel: " + gl);
				}
				System.out.println("##### END GRADELEVELS #####");
				System.out.println("##### BEGIN ADDRESS #####");
				System.out.println("addressType: " + school.getAddress().getAddressType());
				System.out.println("city: " + school.getAddress().getCity());
				System.out.println("line1: " + school.getAddress().getLine1());
				System.out.println("line2: " + school.getAddress().getLine2());
				System.out.println("countryCode: " + school.getAddress().getCountryCode());
				System.out.println("postalCode: " + school.getAddress().getPostalCode());
				System.out.println("stateProvince: " + school.getAddress().getStateProvince());
				System.out.println("##### END ADDRESS #####");
				System.out.println("##### BEGIN PHONENUMBER #####");
				System.out.println("number: " + school.getPhoneNumber().getNumber());
				System.out.println("phoneNumberType: " + school.getPhoneNumber().getPhoneNumberType());
				System.out.println("primaryIndicator: " + school.getPhoneNumber().isPrimaryIndicator());
				System.out.println("##### END PHONENUMBER #####");
				System.out.println("##### BEGIN OTHERPHONENUMBER #####");
				for (XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber())
				{
					System.out.println("otherPhoneNumbers number: " + p.getNumber());
					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
				}
				System.out.println("##### END OTHERPHONENUMBER #####");
				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}

	// RETURN SCHOOLS BY STAFF
	public static void XSchools_GetXSchoolsByXStaffLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXSCHOOLSBYXSTAFF, refId); i++)
		{
			for (XSchoolType school : xPress.getXSchoolsByXStaff(refId).getData())
			{
				System.out.println("refId: " + school.getRefId());
				System.out.println("leaRefId: " + school.getRefId());
				System.out.println("localId: " + school.getLocalId());
				System.out.println("stateProvinceId: " + school.getStateProvinceId());
				System.out.println("##### BEGIN OTHERIDS #####");
				for (XOtherOrganizationIdType id : school.getOtherIds().getOtherId())
				{
					System.out.println("otherId id" + id.getId());
					System.out.println("type: " + id.getType());
				}
				System.out.println("##### END OTHERIDS #####");
				System.out.println("schoolName: " + school.getSchoolName());
				System.out.println("##### BEGIN GRADELEVELS #####");
				for (String gl : school.getGradeLevels().getGradeLevel())
				{
					System.out.println("gradeLevel: " + gl);
				}
				System.out.println("##### END GRADELEVELS #####");
				System.out.println("##### BEGIN ADDRESS #####");
				System.out.println("addressType: " + school.getAddress().getAddressType());
				System.out.println("city: " + school.getAddress().getCity());
				System.out.println("line1: " + school.getAddress().getLine1());
				System.out.println("line2: " + school.getAddress().getLine2());
				System.out.println("countryCode: " + school.getAddress().getCountryCode());
				System.out.println("postalCode: " + school.getAddress().getPostalCode());
				System.out.println("stateProvince: " + school.getAddress().getStateProvince());
				System.out.println("##### END ADDRESS #####");
				System.out.println("##### BEGIN PHONENUMBER #####");
				System.out.println("number: " + school.getPhoneNumber().getNumber());
				System.out.println("phoneNumberType: " + school.getPhoneNumber().getPhoneNumberType());
				System.out.println("primaryIndicator: " + school.getPhoneNumber().isPrimaryIndicator());
				System.out.println("##### END PHONENUMBER #####");
				System.out.println("##### BEGIN OTHERPHONENUMBER #####");
				for (XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber())
				{
					System.out.println("otherPhoneNumbers number: " + p.getNumber());
					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
				}
				System.out.println("##### END OTHERPHONENUMBER #####");
				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}

	// RETURN SCHOOLS BY STUDENT
	public static void XSchools_GetXSchoolsByXStudentLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXSCHOOLSBYXSTUDENT, refId); i++)
		{
			for (XSchoolType school : xPress.getXSchoolsByXStudent(refId).getData())
			{
				System.out.println("refId: " + school.getRefId());
				System.out.println("leaRefId: " + school.getRefId());
				System.out.println("localId: " + school.getLocalId());
				System.out.println("stateProvinceId: " + school.getStateProvinceId());
				System.out.println("##### BEGIN OTHERIDS #####");
				for (XOtherOrganizationIdType id : school.getOtherIds().getOtherId())
				{
					System.out.println("otherId id" + id.getId());
					System.out.println("type: " + id.getType());
				}
				System.out.println("##### END OTHERIDS #####");
				System.out.println("schoolName: " + school.getSchoolName());
				System.out.println("##### BEGIN GRADELEVELS #####");
				for (String gl : school.getGradeLevels().getGradeLevel())
				{
					System.out.println("gradeLevel: " + gl);
				}
				System.out.println("##### END GRADELEVELS #####");
				System.out.println("##### BEGIN ADDRESS #####");
				System.out.println("addressType: " + school.getAddress().getAddressType());
				System.out.println("city: " + school.getAddress().getCity());
				System.out.println("line1: " + school.getAddress().getLine1());
				System.out.println("line2: " + school.getAddress().getLine2());
				System.out.println("countryCode: " + school.getAddress().getCountryCode());
				System.out.println("postalCode: " + school.getAddress().getPostalCode());
				System.out.println("stateProvince: " + school.getAddress().getStateProvince());
				System.out.println("##### END ADDRESS #####");
				System.out.println("##### BEGIN PHONENUMBER #####");
				System.out.println("number: " + school.getPhoneNumber().getNumber());
				System.out.println("phoneNumberType: " + school.getPhoneNumber().getPhoneNumberType());
				System.out.println("primaryIndicator: " + school.getPhoneNumber().isPrimaryIndicator());
				System.out.println("##### END PHONENUMBER #####");
				System.out.println("##### BEGIN OTHERPHONENUMBER #####");
				for (XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber())
				{
					System.out.println("otherPhoneNumbers number: " + p.getNumber());
					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
				}
				System.out.println("##### END OTHERPHONENUMBER #####");
				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}

	// RETURN SCHOOLS BY CONTACT
	public static void XSchools_GetXSchoolsByXContactLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXSCHOOLSBYXCONTACT, refId); i++)
		{
			for (XSchoolType school : xPress.getXSchoolsByXContact(refId).getData())
			{
				System.out.println("refId: " + school.getRefId());
				System.out.println("leaRefId: " + school.getRefId());
				System.out.println("localId: " + school.getLocalId());
				System.out.println("stateProvinceId: " + school.getStateProvinceId());
				System.out.println("##### BEGIN OTHERIDS #####");
				for (XOtherOrganizationIdType id : school.getOtherIds().getOtherId())
				{
					System.out.println("otherId id" + id.getId());
					System.out.println("type: " + id.getType());
				}
				System.out.println("##### END OTHERIDS #####");
				System.out.println("schoolName: " + school.getSchoolName());
				System.out.println("##### BEGIN GRADELEVELS #####");
				for (String gl : school.getGradeLevels().getGradeLevel())
				{
					System.out.println("gradeLevel: " + gl);
				}
				System.out.println("##### END GRADELEVELS #####");
				System.out.println("##### BEGIN ADDRESS #####");
				System.out.println("addressType: " + school.getAddress().getAddressType());
				System.out.println("city: " + school.getAddress().getCity());
				System.out.println("line1: " + school.getAddress().getLine1());
				System.out.println("line2: " + school.getAddress().getLine2());
				System.out.println("countryCode: " + school.getAddress().getCountryCode());
				System.out.println("postalCode: " + school.getAddress().getPostalCode());
				System.out.println("stateProvince: " + school.getAddress().getStateProvince());
				System.out.println("##### END ADDRESS #####");
				System.out.println("##### BEGIN PHONENUMBER #####");
				System.out.println("number: " + school.getPhoneNumber().getNumber());
				System.out.println("phoneNumberType: " + school.getPhoneNumber().getPhoneNumberType());
				System.out.println("primaryIndicator: " + school.getPhoneNumber().isPrimaryIndicator());
				System.out.println("##### END PHONENUMBER #####");
				System.out.println("##### BEGIN OTHERPHONENUMBER #####");
				for (XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber())
				{
					System.out.println("otherPhoneNumbers number: " + p.getNumber());
					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
				}
				System.out.println("##### END OTHERPHONENUMBER #####");
				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}
    
    // #################### xCalendars ####################
	// RETURN ALL CALENDARS
	public static void XCalendars_GetXCalendarsLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXCALENDARS); i++)
		{
			for (XCalendarType calendar : xPress.getXCalendars().getData())
			{
				System.out.println("refId: " + calendar.getRefId());
				System.out.println("schoolRefId: " + calendar.getSchoolRefId());
				System.out.println("schoolYear: " + calendar.getSchoolYear());
				System.out.println("##### BEGIN SESSIONLIST #####");
				for (XSessionType sl : calendar.getSessions().getSessionList())
				{
					System.out.println("sessionType: " + sl.getSessionType());
					System.out.println("sessionCode: " + sl.getSessionCode());
					System.out.println("description: " + sl.getDescription());
					System.out.println("markingTerm: " + sl.isMarkingTerm());
					System.out.println("schedulingTerm: " + sl.isSchedulingTerm());
					System.out.println("linkedSessionCode: " + sl.getSessionCode());
					System.out.println("startDate: " + sl.getStartDate());
					System.out.println("endDate: " + sl.getEndDate());
				}
				System.out.println("##### END SESSIONLIST #####");
				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}
	// RETURN CALENDARS BY LEA
	public static void XCalendars_GetXCalendarsByXLeaLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXCALENDARSBYXLEA, refId); i++)
		{
			for (XCalendarType calendar : xPress.getXCalendarsByXLea(refId).getData())
			{
				System.out.println("refId: " + calendar.getRefId());
				System.out.println("schoolRefId: " + calendar.getSchoolRefId());
				System.out.println("schoolYear: " + calendar.getSchoolYear());
				System.out.println("##### BEGIN SESSIONLIST #####");
				for (XSessionType sl : calendar.getSessions().getSessionList())
				{
					System.out.println("sessionType: " + sl.getSessionType());
					System.out.println("sessionCode: " + sl.getSessionCode());
					System.out.println("description: " + sl.getDescription());
					System.out.println("markingTerm: " + sl.isMarkingTerm());
					System.out.println("schedulingTerm: " + sl.isSchedulingTerm());
					System.out.println("linkedSessionCode: " + sl.getSessionCode());
					System.out.println("startDate: " + sl.getStartDate());
					System.out.println("endDate: " + sl.getEndDate());
				}
				System.out.println("##### END SESSIONLIST #####");
				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}

	// RETURN CALENDARS BY SCHOOL
	public static void XCalendars_GetXCalendarsByXSchoolLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXCALENDARSBYXSCHOOL, refId); i++)
		{
			for (XCalendarType calendar : xPress.getXCalendarsByXSchool(refId).getData())
			{
				System.out.println("refId: " + calendar.getRefId());
				System.out.println("schoolRefId: " + calendar.getSchoolRefId());
				System.out.println("schoolYear: " + calendar.getSchoolYear());
				System.out.println("##### BEGIN SESSIONLIST #####");
				for (XSessionType sl : calendar.getSessions().getSessionList())
				{
					System.out.println("sessionType: " + sl.getSessionType());
					System.out.println("sessionCode: " + sl.getSessionCode());
					System.out.println("description: " + sl.getDescription());
					System.out.println("markingTerm: " + sl.isMarkingTerm());
					System.out.println("schedulingTerm: " + sl.isSchedulingTerm());
					System.out.println("linkedSessionCode: " + sl.getSessionCode());
					System.out.println("startDate: " + sl.getStartDate());
					System.out.println("endDate: " + sl.getEndDate());
				}
				System.out.println("##### END SESSIONLIST #####");
				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}
    
    // #################### xCourses ####################
	// RETURN ALL COURSES
	public static void XCourses_GetXCoursesLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXCOURSES); i++)
		{
			for (XCourseType course : xPress.getXCourses().getData())
			{
				System.out.println("refId: " + course.getRefId());
				System.out.println("schoolRefId: " + course.getSchoolRefId());
				System.out.println("schoolCourseId: " + course.getSchoolCourseId());
				System.out.println("leaCourseId: " + course.getLeaCourseId());
				System.out.println("##### BEGIN OTHERIDS #####");
				for (XOtherCourseIdType id : course.getOtherIds().getOtherId())
				{
					System.out.println("otherId id" + id.getId());
					System.out.println("type: " + id.getType());
				}
				System.out.println("##### END OTHERIDS #####");
				System.out.println("courseTitle: " + course.getCourseTitle());
				System.out.println("description: " + course.getDescription());
				System.out.println("subject: " + course.getSubject());
				System.out.println("##### BEGIN APPLICABLEEDUCATIONLEVELS #####");
				for (String ael : course.getApplicableEducationLevels().getApplicableEducationLevel())
				{
					System.out.println("applicableEducationLevel: " + ael);
				}
				System.out.println("##### END APPLICABLEEDUCATIONLEVELS #####");
				System.out.println("scedCourseCode: " + course.getScedCourseCode());
				System.out.println("scedCourseLevelCode: " + course.getScedCourseLevelCode());
				System.out.println("scedCourseSubjectAreaCode: " + course.getScedCourseSubjectAreaCode());

				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}

	// RETURN COURSES BY LEA
	public static void XCourses_GetXCoursesByXLeaLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXCOURSESBYXLEA, refId); i++)
		{
			for (XCourseType course : xPress.getXCoursesByXLea(refId).getData())
			{
				System.out.println("refId: " + course.getRefId());
				System.out.println("schoolRefId: " + course.getSchoolRefId());
				System.out.println("schoolCourseId: " + course.getSchoolCourseId());
				System.out.println("leaCourseId: " + course.getLeaCourseId());
				System.out.println("##### BEGIN OTHERIDS #####");
				for (XOtherCourseIdType id : course.getOtherIds().getOtherId())
				{
					System.out.println("otherId id" + id.getId());
					System.out.println("type: " + id.getType());
				}
				System.out.println("##### END OTHERIDS #####");
				System.out.println("courseTitle: " + course.getCourseTitle());
				System.out.println("description: " + course.getDescription());
				System.out.println("subject: " + course.getSubject());
				System.out.println("##### BEGIN APPLICABLEEDUCATIONLEVELS #####");
				for (String ael : course.getApplicableEducationLevels().getApplicableEducationLevel())
				{
					System.out.println("applicableEducationLevel: " + ael);
				}
				System.out.println("##### END APPLICABLEEDUCATIONLEVELS #####");
				System.out.println("scedCourseCode: " + course.getScedCourseCode());
				System.out.println("scedCourseLevelCode: " + course.getScedCourseLevelCode());
				System.out.println("scedCourseSubjectAreaCode: " + course.getScedCourseSubjectAreaCode());

				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}
	// RETURN COURSES BY SCHOOL
	public static void XCourses_GetXCoursesByXSchoolLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXCOURSESBYXSCHOOL, refId); i++)
		{
			for (XCourseType course : xPress.getXCoursesByXSchool(refId).getData())
			{
				System.out.println("refId: " + course.getRefId());
				System.out.println("schoolRefId: " + course.getSchoolRefId());
				System.out.println("schoolCourseId: " + course.getSchoolCourseId());
				System.out.println("leaCourseId: " + course.getLeaCourseId());
				System.out.println("##### BEGIN OTHERIDS #####");
				for (XOtherCourseIdType id : course.getOtherIds().getOtherId())
				{
					System.out.println("otherId id" + id.getId());
					System.out.println("type: " + id.getType());
				}
				System.out.println("##### END OTHERIDS #####");
				System.out.println("courseTitle: " + course.getCourseTitle());
				System.out.println("description: " + course.getDescription());
				System.out.println("subject: " + course.getSubject());
				System.out.println("##### BEGIN APPLICABLEEDUCATIONLEVELS #####");
				for (String ael : course.getApplicableEducationLevels().getApplicableEducationLevel())
				{
					System.out.println("applicableEducationLevel: " + ael);
				}
				System.out.println("##### END APPLICABLEEDUCATIONLEVELS #####");
				System.out.println("scedCourseCode: " + course.getScedCourseCode());
				System.out.println("scedCourseLevelCode: " + course.getScedCourseLevelCode());
				System.out.println("scedCourseSubjectAreaCode: " + course.getScedCourseSubjectAreaCode());

				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}
	// RETURN COURSES BY ROSTER
	public static void XCourses_GetXCoursesByXRosterLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXCOURSESBYXROSTER, refId); i++)
		{
			for (XCourseType course : xPress.getXCoursesByXRoster(refId).getData())
			{
				System.out.println("refId: " + course.getRefId());
				System.out.println("schoolRefId: " + course.getSchoolRefId());
				System.out.println("schoolCourseId: " + course.getSchoolCourseId());
				System.out.println("leaCourseId: " + course.getLeaCourseId());
				System.out.println("##### BEGIN OTHERIDS #####");
				for (XOtherCourseIdType id : course.getOtherIds().getOtherId())
				{
					System.out.println("otherId id" + id.getId());
					System.out.println("type: " + id.getType());
				}
				System.out.println("##### END OTHERIDS #####");
				System.out.println("courseTitle: " + course.getCourseTitle());
				System.out.println("description: " + course.getDescription());
				System.out.println("subject: " + course.getSubject());
				System.out.println("##### BEGIN APPLICABLEEDUCATIONLEVELS #####");
				for (String ael : course.getApplicableEducationLevels().getApplicableEducationLevel())
				{
					System.out.println("applicableEducationLevel: " + ael);
				}
				System.out.println("##### END APPLICABLEEDUCATIONLEVELS #####");
				System.out.println("scedCourseCode: " + course.getScedCourseCode());
				System.out.println("scedCourseLevelCode: " + course.getScedCourseLevelCode());
				System.out.println("scedCourseSubjectAreaCode: " + course.getScedCourseSubjectAreaCode());

				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}
 	
    // #################### xRosters ####################
	// RETURN ALL ROSTERS
	public static void XRosters_GetXRostersLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXROSTERS); i++)
		{
			for (XRosterType r : xPress.getXRosters().getData())
			{
				System.out.println("refId: " + r.getRefId());
				System.out.println("courseRefId: " + r.getCourseRefId());
				System.out.println("courseTitle: " + r.getCourseTitle());
				System.out.println("sectionRefId: " + r.getSectionRefId());
				System.out.println("subject: " + r.getSubject());
				System.out.println("schoolRefId: " + r.getSchoolRefId());
				System.out.println("schoolSectionId: " + r.getSchoolSectionId());
				System.out.println("schoolYear: " + r.getSchoolYear());
				System.out.println("sessionCode: " + r.getSessionCode());
				System.out.println("schoolCalendarRefId: " + r.getSchoolCalendarRefId());

				System.out.println("##### BEGIN MEETING TIMES #####");
				for (XMeetingTimeType mt : r.getMeetingTimes().getMeetingTime())
				{
					System.out.println("timeTableDay: " + mt.getTimeTableDay());

					System.out.println("bellScheduleDay: " + mt.getClassMeetingDays().getBellScheduleDay());
					System.out.println("timeTablePeriod: " + mt.getTimeTablePeriod());
					System.out.println("roomNumber: " + mt.getRoomNumber());
					System.out.println("classBeginningTime: " + mt.getClassBeginningTime());
					System.out.println("classEndingTime: " + mt.getClassEndingTime());
				}
				System.out.println("##### END MEETING TIMES #####");

				System.out.println("##### BEGIN STUDENTS #####");
				for (XPersonReferenceType student : r.getStudents().getStudentReference())
				{
					System.out.println("refId: " + student.getRefId());
					System.out.println("localId: " + student.getLocalId());
					System.out.println("givenName: " + student.getGivenName());
					System.out.println("familyName: " + student.getFamilyName());
				}
				System.out.println("##### END STUDENTS #####");

				System.out.println("##### BEGIN PRIMARY STAFF #####");
				System.out.println("refId: " + r.getPrimaryStaff().getStaffPersonReference().getRefId());
				System.out.println("localId: " + r.getPrimaryStaff().getStaffPersonReference().getLocalId());
				System.out.println("givenName: " + r.getPrimaryStaff().getStaffPersonReference().getGivenName());
				System.out.println("familyName: " + r.getPrimaryStaff().getStaffPersonReference().getFamilyName());
				System.out.println("teacherOfRecord: " + r.getPrimaryStaff().isTeacherOfRecord());
				System.out.println("percentResponsible: " + r.getPrimaryStaff().getPercentResponsible());
				System.out.println("##### END PRIMARY STAFF #####");

				System.out.println("##### BEGIN OTHER STAFF #####");
				for (XStaffReferenceType staff : r.getOtherStaffs().getOtherStaff())
				{
					System.out.println("refId: " + staff.getStaffPersonReference().getRefId());
					System.out.println("localId: " + staff.getStaffPersonReference().getLocalId());
					System.out.println("givenName: " + staff.getStaffPersonReference().getGivenName());
					System.out.println("familyName: " + staff.getStaffPersonReference().getFamilyName());
					System.out.println("teacherOfRecord: " + staff.isTeacherOfRecord());
					System.out.println("percentResponsible: " + staff.getPercentResponsible());
				}
				System.out.println("##### END OTHER STAFF #####");
				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}

	}

	// RETURN ROSTERS BY LEA
	public static void XRosters_GetXRostersByXLeaLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXROSTERSBYXLEA, refId); i++)
		{
			for (XRosterType r : xPress.getXRostersByXLea(refId).getData())
			{
				System.out.println("refId: " + r.getRefId());
				System.out.println("courseRefId: " + r.getCourseRefId());
				System.out.println("courseTitle: " + r.getCourseTitle());
				System.out.println("sectionRefId: " + r.getSectionRefId());
				System.out.println("subject: " + r.getSubject());
				System.out.println("schoolRefId: " + r.getSchoolRefId());
				System.out.println("schoolSectionId: " + r.getSchoolSectionId());
				System.out.println("schoolYear: " + r.getSchoolYear());
				System.out.println("sessionCode: " + r.getSessionCode());
				System.out.println("schoolCalendarRefId: " + r.getSchoolCalendarRefId());

				System.out.println("##### BEGIN MEETING TIMES #####");
				for (XMeetingTimeType mt : r.getMeetingTimes().getMeetingTime())
				{
					System.out.println("timeTableDay: " + mt.getTimeTableDay());

					System.out.println("bellScheduleDay: " + mt.getClassMeetingDays().getBellScheduleDay());
					System.out.println("timeTablePeriod: " + mt.getTimeTablePeriod());
					System.out.println("roomNumber: " + mt.getRoomNumber());
					System.out.println("classBeginningTime: " + mt.getClassBeginningTime());
					System.out.println("classEndingTime: " + mt.getClassEndingTime());
				}
				System.out.println("##### END MEETING TIMES #####");

				System.out.println("##### BEGIN STUDENTS #####");
				for (XPersonReferenceType student : r.getStudents().getStudentReference())
				{
					System.out.println("refId: " + student.getRefId());
					System.out.println("localId: " + student.getLocalId());
					System.out.println("givenName: " + student.getGivenName());
					System.out.println("familyName: " + student.getFamilyName());
				}
				System.out.println("##### END STUDENTS #####");

				System.out.println("##### BEGIN PRIMARY STAFF #####");
				System.out.println("refId: " + r.getPrimaryStaff().getStaffPersonReference().getRefId());
				System.out.println("localId: " + r.getPrimaryStaff().getStaffPersonReference().getLocalId());
				System.out.println("givenName: " + r.getPrimaryStaff().getStaffPersonReference().getGivenName());
				System.out.println("familyName: " + r.getPrimaryStaff().getStaffPersonReference().getFamilyName());
				System.out.println("teacherOfRecord: " + r.getPrimaryStaff().isTeacherOfRecord());
				System.out.println("percentResponsible: " + r.getPrimaryStaff().getPercentResponsible());
				System.out.println("##### END PRIMARY STAFF #####");

				System.out.println("##### BEGIN OTHER STAFF #####");
				for (XStaffReferenceType staff : r.getOtherStaffs().getOtherStaff())
				{
					System.out.println("refId: " + staff.getStaffPersonReference().getRefId());
					System.out.println("localId: " + staff.getStaffPersonReference().getLocalId());
					System.out.println("givenName: " + staff.getStaffPersonReference().getGivenName());
					System.out.println("familyName: " + staff.getStaffPersonReference().getFamilyName());
					System.out.println("teacherOfRecord: " + staff.isTeacherOfRecord());
					System.out.println("percentResponsible: " + staff.getPercentResponsible());
				}
				System.out.println("##### END OTHER STAFF #####");
				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}

	// RETURN ROSTERS BY SCHOOL
	public static void XRosters_GetXRostersByXSchoolLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXROSTERSBYXSCHOOL, refId); i++)
		{
			for (XRosterType r : xPress.getXRostersByXSchool(refId).getData())
			{
				System.out.println("refId: " + r.getRefId());
				System.out.println("courseRefId: " + r.getCourseRefId());
				System.out.println("courseTitle: " + r.getCourseTitle());
				System.out.println("sectionRefId: " + r.getSectionRefId());
				System.out.println("subject: " + r.getSubject());
				System.out.println("schoolRefId: " + r.getSchoolRefId());
				System.out.println("schoolSectionId: " + r.getSchoolSectionId());
				System.out.println("schoolYear: " + r.getSchoolYear());
				System.out.println("sessionCode: " + r.getSessionCode());
				System.out.println("schoolCalendarRefId: " + r.getSchoolCalendarRefId());

				System.out.println("##### BEGIN MEETING TIMES #####");
				for (XMeetingTimeType mt : r.getMeetingTimes().getMeetingTime())
				{
					System.out.println("timeTableDay: " + mt.getTimeTableDay());

					System.out.println("bellScheduleDay: " + mt.getClassMeetingDays().getBellScheduleDay());
					System.out.println("timeTablePeriod: " + mt.getTimeTablePeriod());
					System.out.println("roomNumber: " + mt.getRoomNumber());
					System.out.println("classBeginningTime: " + mt.getClassBeginningTime());
					System.out.println("classEndingTime: " + mt.getClassEndingTime());
				}
				System.out.println("##### END MEETING TIMES #####");

				System.out.println("##### BEGIN STUDENTS #####");
				for (XPersonReferenceType student : r.getStudents().getStudentReference())
				{
					System.out.println("refId: " + student.getRefId());
					System.out.println("localId: " + student.getLocalId());
					System.out.println("givenName: " + student.getGivenName());
					System.out.println("familyName: " + student.getFamilyName());
				}
				System.out.println("##### END STUDENTS #####");

				System.out.println("##### BEGIN PRIMARY STAFF #####");
				System.out.println("refId: " + r.getPrimaryStaff().getStaffPersonReference().getRefId());
				System.out.println("localId: " + r.getPrimaryStaff().getStaffPersonReference().getLocalId());
				System.out.println("givenName: " + r.getPrimaryStaff().getStaffPersonReference().getGivenName());
				System.out.println("familyName: " + r.getPrimaryStaff().getStaffPersonReference().getFamilyName());
				System.out.println("teacherOfRecord: " + r.getPrimaryStaff().isTeacherOfRecord());
				System.out.println("percentResponsible: " + r.getPrimaryStaff().getPercentResponsible());
				System.out.println("##### END PRIMARY STAFF #####");

				System.out.println("##### BEGIN OTHER STAFF #####");
				for (XStaffReferenceType staff : r.getOtherStaffs().getOtherStaff())
				{
					System.out.println("refId: " + staff.getStaffPersonReference().getRefId());
					System.out.println("localId: " + staff.getStaffPersonReference().getLocalId());
					System.out.println("givenName: " + staff.getStaffPersonReference().getGivenName());
					System.out.println("familyName: " + staff.getStaffPersonReference().getFamilyName());
					System.out.println("teacherOfRecord: " + staff.isTeacherOfRecord());
					System.out.println("percentResponsible: " + staff.getPercentResponsible());
				}
				System.out.println("##### END OTHER STAFF #####");
				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}

	// RETURN ROSTERS BY CROUSE
	public static void XRosters_GetXRostersByXCourseLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXROSTERSBYXCOURSE, refId); i++)
		{
			for (XRosterType r : xPress.getXRostersByXCourse(refId).getData())
			{
				System.out.println("refId: " + r.getRefId());
				System.out.println("courseRefId: " + r.getCourseRefId());
				System.out.println("courseTitle: " + r.getCourseTitle());
				System.out.println("sectionRefId: " + r.getSectionRefId());
				System.out.println("subject: " + r.getSubject());
				System.out.println("schoolRefId: " + r.getSchoolRefId());
				System.out.println("schoolSectionId: " + r.getSchoolSectionId());
				System.out.println("schoolYear: " + r.getSchoolYear());
				System.out.println("sessionCode: " + r.getSessionCode());
				System.out.println("schoolCalendarRefId: " + r.getSchoolCalendarRefId());

				System.out.println("##### BEGIN MEETING TIMES #####");
				for (XMeetingTimeType mt : r.getMeetingTimes().getMeetingTime())
				{
					System.out.println("timeTableDay: " + mt.getTimeTableDay());

					System.out.println("bellScheduleDay: " + mt.getClassMeetingDays().getBellScheduleDay());
					System.out.println("timeTablePeriod: " + mt.getTimeTablePeriod());
					System.out.println("roomNumber: " + mt.getRoomNumber());
					System.out.println("classBeginningTime: " + mt.getClassBeginningTime());
					System.out.println("classEndingTime: " + mt.getClassEndingTime());
				}
				System.out.println("##### END MEETING TIMES #####");

				System.out.println("##### BEGIN STUDENTS #####");
				for (XPersonReferenceType student : r.getStudents().getStudentReference())
				{
					System.out.println("refId: " + student.getRefId());
					System.out.println("localId: " + student.getLocalId());
					System.out.println("givenName: " + student.getGivenName());
					System.out.println("familyName: " + student.getFamilyName());
				}
				System.out.println("##### END STUDENTS #####");

				System.out.println("##### BEGIN PRIMARY STAFF #####");
				System.out.println("refId: " + r.getPrimaryStaff().getStaffPersonReference().getRefId());
				System.out.println("localId: " + r.getPrimaryStaff().getStaffPersonReference().getLocalId());
				System.out.println("givenName: " + r.getPrimaryStaff().getStaffPersonReference().getGivenName());
				System.out.println("familyName: " + r.getPrimaryStaff().getStaffPersonReference().getFamilyName());
				System.out.println("teacherOfRecord: " + r.getPrimaryStaff().isTeacherOfRecord());
				System.out.println("percentResponsible: " + r.getPrimaryStaff().getPercentResponsible());
				System.out.println("##### END PRIMARY STAFF #####");

				System.out.println("##### BEGIN OTHER STAFF #####");
				for (XStaffReferenceType staff : r.getOtherStaffs().getOtherStaff())
				{
					System.out.println("refId: " + staff.getStaffPersonReference().getRefId());
					System.out.println("localId: " + staff.getStaffPersonReference().getLocalId());
					System.out.println("givenName: " + staff.getStaffPersonReference().getGivenName());
					System.out.println("familyName: " + staff.getStaffPersonReference().getFamilyName());
					System.out.println("teacherOfRecord: " + staff.isTeacherOfRecord());
					System.out.println("percentResponsible: " + staff.getPercentResponsible());
				}
				System.out.println("##### END OTHER STAFF #####");
				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}

	// RETURN ROSTERS BY STAFF
	public static void XRosters_GetXRostersByXStaffLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXROSTERSBYXSTAFF, refId); i++)
		{
			for (XRosterType r : xPress.getXRostersByXStaff(refId).getData())
			{
				System.out.println("refId: " + r.getRefId());
				System.out.println("courseRefId: " + r.getCourseRefId());
				System.out.println("courseTitle: " + r.getCourseTitle());
				System.out.println("sectionRefId: " + r.getSectionRefId());
				System.out.println("subject: " + r.getSubject());
				System.out.println("schoolRefId: " + r.getSchoolRefId());
				System.out.println("schoolSectionId: " + r.getSchoolSectionId());
				System.out.println("schoolYear: " + r.getSchoolYear());
				System.out.println("sessionCode: " + r.getSessionCode());
				System.out.println("schoolCalendarRefId: " + r.getSchoolCalendarRefId());

				System.out.println("##### BEGIN MEETING TIMES #####");
				for (XMeetingTimeType mt : r.getMeetingTimes().getMeetingTime())
				{
					System.out.println("timeTableDay: " + mt.getTimeTableDay());

					System.out.println("bellScheduleDay: " + mt.getClassMeetingDays().getBellScheduleDay());
					System.out.println("timeTablePeriod: " + mt.getTimeTablePeriod());
					System.out.println("roomNumber: " + mt.getRoomNumber());
					System.out.println("classBeginningTime: " + mt.getClassBeginningTime());
					System.out.println("classEndingTime: " + mt.getClassEndingTime());
				}
				System.out.println("##### END MEETING TIMES #####");

				System.out.println("##### BEGIN STUDENTS #####");
				for (XPersonReferenceType student : r.getStudents().getStudentReference())
				{
					System.out.println("refId: " + student.getRefId());
					System.out.println("localId: " + student.getLocalId());
					System.out.println("givenName: " + student.getGivenName());
					System.out.println("familyName: " + student.getFamilyName());
				}
				System.out.println("##### END STUDENTS #####");

				System.out.println("##### BEGIN PRIMARY STAFF #####");
				System.out.println("refId: " + r.getPrimaryStaff().getStaffPersonReference().getRefId());
				System.out.println("localId: " + r.getPrimaryStaff().getStaffPersonReference().getLocalId());
				System.out.println("givenName: " + r.getPrimaryStaff().getStaffPersonReference().getGivenName());
				System.out.println("familyName: " + r.getPrimaryStaff().getStaffPersonReference().getFamilyName());
				System.out.println("teacherOfRecord: " + r.getPrimaryStaff().isTeacherOfRecord());
				System.out.println("percentResponsible: " + r.getPrimaryStaff().getPercentResponsible());
				System.out.println("##### END PRIMARY STAFF #####");

				System.out.println("##### BEGIN OTHER STAFF #####");
				for (XStaffReferenceType staff : r.getOtherStaffs().getOtherStaff())
				{
					System.out.println("refId: " + staff.getStaffPersonReference().getRefId());
					System.out.println("localId: " + staff.getStaffPersonReference().getLocalId());
					System.out.println("givenName: " + staff.getStaffPersonReference().getGivenName());
					System.out.println("familyName: " + staff.getStaffPersonReference().getFamilyName());
					System.out.println("teacherOfRecord: " + staff.isTeacherOfRecord());
					System.out.println("percentResponsible: " + staff.getPercentResponsible());
				}
				System.out.println("##### END OTHER STAFF #####");
				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}

	// RETURN ROSTERS BY STUDENT
	public static void XRosters_GetXRostersByXStudentLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXROSTERSBYXSTUDENT, refId); i++)
		{
			for (XRosterType r : xPress.getXRostersByXStudent(refId).getData())
			{
				System.out.println("refId: " + r.getRefId());
				System.out.println("courseRefId: " + r.getCourseRefId());
				System.out.println("courseTitle: " + r.getCourseTitle());
				System.out.println("sectionRefId: " + r.getSectionRefId());
				System.out.println("subject: " + r.getSubject());
				System.out.println("schoolRefId: " + r.getSchoolRefId());
				System.out.println("schoolSectionId: " + r.getSchoolSectionId());
				System.out.println("schoolYear: " + r.getSchoolYear());
				System.out.println("sessionCode: " + r.getSessionCode());
				System.out.println("schoolCalendarRefId: " + r.getSchoolCalendarRefId());

				System.out.println("##### BEGIN MEETING TIMES #####");
				for (XMeetingTimeType mt : r.getMeetingTimes().getMeetingTime())
				{
					System.out.println("timeTableDay: " + mt.getTimeTableDay());

					System.out.println("bellScheduleDay: " + mt.getClassMeetingDays().getBellScheduleDay());
					System.out.println("timeTablePeriod: " + mt.getTimeTablePeriod());
					System.out.println("roomNumber: " + mt.getRoomNumber());
					System.out.println("classBeginningTime: " + mt.getClassBeginningTime());
					System.out.println("classEndingTime: " + mt.getClassEndingTime());
				}
				System.out.println("##### END MEETING TIMES #####");

				System.out.println("##### BEGIN STUDENTS #####");
				for (XPersonReferenceType student : r.getStudents().getStudentReference())
				{
					System.out.println("refId: " + student.getRefId());
					System.out.println("localId: " + student.getLocalId());
					System.out.println("givenName: " + student.getGivenName());
					System.out.println("familyName: " + student.getFamilyName());
				}
				System.out.println("##### END STUDENTS #####");

				System.out.println("##### BEGIN PRIMARY STAFF #####");
				System.out.println("refId: " + r.getPrimaryStaff().getStaffPersonReference().getRefId());
				System.out.println("localId: " + r.getPrimaryStaff().getStaffPersonReference().getLocalId());
				System.out.println("givenName: " + r.getPrimaryStaff().getStaffPersonReference().getGivenName());
				System.out.println("familyName: " + r.getPrimaryStaff().getStaffPersonReference().getFamilyName());
				System.out.println("teacherOfRecord: " + r.getPrimaryStaff().isTeacherOfRecord());
				System.out.println("percentResponsible: " + r.getPrimaryStaff().getPercentResponsible());
				System.out.println("##### END PRIMARY STAFF #####");

				System.out.println("##### BEGIN OTHER STAFF #####");
				for (XStaffReferenceType staff : r.getOtherStaffs().getOtherStaff())
				{
					System.out.println("refId: " + staff.getStaffPersonReference().getRefId());
					System.out.println("localId: " + staff.getStaffPersonReference().getLocalId());
					System.out.println("givenName: " + staff.getStaffPersonReference().getGivenName());
					System.out.println("familyName: " + staff.getStaffPersonReference().getFamilyName());
					System.out.println("teacherOfRecord: " + staff.isTeacherOfRecord());
					System.out.println("percentResponsible: " + staff.getPercentResponsible());
				}
				System.out.println("##### END OTHER STAFF #####");
				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}
 	
    // #################### xStaffs ####################
	// RETURN ALL STAFFS
	public static void XStaffs_GetXStaffsLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXSTAFFS); i++)
		{
			for (XStaffType s : xPress.getXStaffs().getData())
			{
				System.out.println("refId: " + s.getRefId());
				System.out.println("##### BEGIN NAME #####");
				System.out.println("type: " + s.getName().getType());
				System.out.println("prefix: " + s.getName().getPrefix());
				System.out.println("familyName: " + s.getName().getFamilyName());
				System.out.println("givenName: " + s.getName().getGivenName());
				System.out.println("middleName: " + s.getName().getMiddleName());
				System.out.println("suffix: " + s.getName().getSuffix());
				System.out.println("##### END NAME #####");
				System.out.println("localId: " + s.getLocalId());
				System.out.println("stateProvinceId: " + s.getStateProvinceId());
				System.out.println("##### BEGIN OTHERIDS #####");
				for (XOtherPersonIdType id : s.getOtherIds().getOtherId())
				{
					System.out.println("id: " + id.getId());
					System.out.println("type: " + id.getType());
				}
				System.out.println("##### END OTHERIDS #####");
				System.out.println("sex: " + s.getSex());
				System.out.println("##### BEGIN EMAIL #####");
				System.out.println("emailType: " + s.getEmail().getEmailType());
				System.out.println("emailAddress: " + s.getEmail().getEmailAddress());
				System.out.println("##### END EMAIL #####");
				System.out.println("##### BEGIN PRIMARYASSIGNMENT #####");
				System.out.println("leaRefId: " + s.getPrimaryAssignment().getLeaRefId());
				System.out.println("schoolRefId: " + s.getPrimaryAssignment().getSchoolRefId());
				System.out.println("jobFunction: " + s.getPrimaryAssignment().getJobFunction());
				System.out.println("##### END PRIMARYASSIGNMENT #####");
				System.out.println("##### BEGIN OTHERASSIGNMENT #####");
				for (XStaffPersonAssignmentType pa : s.getOtherAssignments().getStaffPersonAssignment())
				{
					System.out.println("leaRefId: " + pa.getLeaRefId());
					System.out.println("schoolRefId: " + pa.getSchoolRefId());
					System.out.println("jobFunction: " + pa.getJobFunction());
				}
				System.out.println("##### END OTHERASSIGNMENT #####");
				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}

	// RETURN STAFFS BY LEA
	public static void XStaffs_GetXStaffsByXLeaLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXSTAFFSBYXLEA, refId); i++)
		{
			for (XStaffType s : xPress.getXStaffsByXLea(refId).getData())
			{
				System.out.println("refId: " + s.getRefId());
				System.out.println("##### BEGIN NAME #####");
				System.out.println("type: " + s.getName().getType());
				System.out.println("prefix: " + s.getName().getPrefix());
				System.out.println("familyName: " + s.getName().getFamilyName());
				System.out.println("givenName: " + s.getName().getGivenName());
				System.out.println("middleName: " + s.getName().getMiddleName());
				System.out.println("suffix: " + s.getName().getSuffix());
				System.out.println("##### END NAME #####");
				System.out.println("localId: " + s.getLocalId());
				System.out.println("stateProvinceId: " + s.getStateProvinceId());
				System.out.println("##### BEGIN OTHERIDS #####");
				for (XOtherPersonIdType id : s.getOtherIds().getOtherId())
				{
					System.out.println("id: " + id.getId());
					System.out.println("type: " + id.getType());
				}
				System.out.println("##### END OTHERIDS #####");
				System.out.println("sex: " + s.getSex());
				System.out.println("##### BEGIN EMAIL #####");
				System.out.println("emailType: " + s.getEmail().getEmailType());
				System.out.println("emailAddress: " + s.getEmail().getEmailAddress());
				System.out.println("##### END EMAIL #####");
				System.out.println("##### BEGIN PRIMARYASSIGNMENT #####");
				System.out.println("leaRefId: " + s.getPrimaryAssignment().getLeaRefId());
				System.out.println("schoolRefId: " + s.getPrimaryAssignment().getSchoolRefId());
				System.out.println("jobFunction: " + s.getPrimaryAssignment().getJobFunction());
				System.out.println("##### END PRIMARYASSIGNMENT #####");
				System.out.println("##### BEGIN OTHERASSIGNMENT #####");
				for (XStaffPersonAssignmentType pa : s.getOtherAssignments().getStaffPersonAssignment())
				{
					System.out.println("leaRefId: " + pa.getLeaRefId());
					System.out.println("schoolRefId: " + pa.getSchoolRefId());
					System.out.println("jobFunction: " + pa.getJobFunction());
				}
				System.out.println("##### END OTHERASSIGNMENT #####");
				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}

	// RETURN STAFFS BY SCHOOL
	public static void XStaffs_GetXStaffsByXSchoolLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXSTAFFSBYXSCHOOL, refId); i++)
		{
			for (XStaffType s : xPress.getXStaffsByXSchool(refId).getData())
			{
				System.out.println("refId: " + s.getRefId());
				System.out.println("##### BEGIN NAME #####");
				System.out.println("type: " + s.getName().getType());
				System.out.println("prefix: " + s.getName().getPrefix());
				System.out.println("familyName: " + s.getName().getFamilyName());
				System.out.println("givenName: " + s.getName().getGivenName());
				System.out.println("middleName: " + s.getName().getMiddleName());
				System.out.println("suffix: " + s.getName().getSuffix());
				System.out.println("##### END NAME #####");
				System.out.println("localId: " + s.getLocalId());
				
				System.out.println("stateProvinceId: " + s.getStateProvinceId());
				System.out.println("##### BEGIN OTHERIDS #####");
				for (XOtherPersonIdType id : s.getOtherIds().getOtherId())
				{
					System.out.println("id: " + id.getId());
					System.out.println("type: " + id.getType());
				}
				System.out.println("##### END OTHERIDS #####");
				System.out.println("sex: " + s.getSex());
				System.out.println("##### BEGIN EMAIL #####");
				System.out.println("emailType: " + s.getEmail().getEmailType());
				System.out.println("emailAddress: " + s.getEmail().getEmailAddress());
				System.out.println("##### END EMAIL #####");
				System.out.println("##### BEGIN PRIMARYASSIGNMENT #####");
				System.out.println("leaRefId: " + s.getPrimaryAssignment().getLeaRefId());
				System.out.println("schoolRefId: " + s.getPrimaryAssignment().getSchoolRefId());
				System.out.println("jobFunction: " + s.getPrimaryAssignment().getJobFunction());
				System.out.println("##### END PRIMARYASSIGNMENT #####");
				System.out.println("##### BEGIN OTHERASSIGNMENT #####");
				for (XStaffPersonAssignmentType pa : s.getOtherAssignments().getStaffPersonAssignment())
				{
					System.out.println("leaRefId: " + pa.getLeaRefId());
					System.out.println("schoolRefId: " + pa.getSchoolRefId());
					System.out.println("jobFunction: " + pa.getJobFunction());
				}
				System.out.println("##### END OTHERASSIGNMENT #####");
				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}

	// RETURN STAFFS BY COURSE
	public static void XStaffs_GetXStaffsByXCourseLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXSTAFFSBYXCOURSE, refId); i++)
		{
			for (XStaffType s : xPress.getXStaffsByXCourse(refId).getData())
			{
				System.out.println("refId: " + s.getRefId());
				System.out.println("##### BEGIN NAME #####");
				System.out.println("type: " + s.getName().getType());
				System.out.println("prefix: " + s.getName().getPrefix());
				System.out.println("familyName: " + s.getName().getFamilyName());
				System.out.println("givenName: " + s.getName().getGivenName());
				System.out.println("middleName: " + s.getName().getMiddleName());
				System.out.println("suffix: " + s.getName().getSuffix());
				System.out.println("##### END NAME #####");
				System.out.println("localId: " + s.getLocalId());
				
				System.out.println("stateProvinceId: " + s.getStateProvinceId());
				System.out.println("##### BEGIN OTHERIDS #####");
				for (XOtherPersonIdType id : s.getOtherIds().getOtherId())
				{
					System.out.println("id: " + id.getId());
					System.out.println("type: " + id.getType());
				}
				System.out.println("##### END OTHERIDS #####");
				System.out.println("sex: " + s.getSex());
				System.out.println("##### BEGIN EMAIL #####");
				System.out.println("emailType: " + s.getEmail().getEmailType());
				System.out.println("emailAddress: " + s.getEmail().getEmailAddress());
				System.out.println("##### END EMAIL #####");
				System.out.println("##### BEGIN PRIMARYASSIGNMENT #####");
				System.out.println("leaRefId: " + s.getPrimaryAssignment().getLeaRefId());
				System.out.println("schoolRefId: " + s.getPrimaryAssignment().getSchoolRefId());
				System.out.println("jobFunction: " + s.getPrimaryAssignment().getJobFunction());
				System.out.println("##### END PRIMARYASSIGNMENT #####");
				System.out.println("##### BEGIN OTHERASSIGNMENT #####");
				for (XStaffPersonAssignmentType pa : s.getOtherAssignments().getStaffPersonAssignment())
				{
					System.out.println("leaRefId: " + pa.getLeaRefId());
					System.out.println("schoolRefId: " + pa.getSchoolRefId());
					System.out.println("jobFunction: " + pa.getJobFunction());
				}
				System.out.println("##### END OTHERASSIGNMENT #####");
				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}

	// RETURN STAFFS BY ROSTER
	public static void XStaffs_GetXStaffsByXRosterLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXSTAFFSBYXROSTER, refId); i++)
		{
			for (XStaffType s : xPress.getXStaffsByXRoster(refId).getData())
			{
				System.out.println("refId: " + s.getRefId());
				System.out.println("##### BEGIN NAME #####");
				System.out.println("type: " + s.getName().getType());
				System.out.println("prefix: " + s.getName().getPrefix());
				System.out.println("familyName: " + s.getName().getFamilyName());
				System.out.println("givenName: " + s.getName().getGivenName());
				System.out.println("middleName: " + s.getName().getMiddleName());
				System.out.println("suffix: " + s.getName().getSuffix());
				System.out.println("##### END NAME #####");
				System.out.println("localId: " + s.getLocalId());
				
				System.out.println("stateProvinceId: " + s.getStateProvinceId());
				System.out.println("##### BEGIN OTHERIDS #####");
				for (XOtherPersonIdType id : s.getOtherIds().getOtherId())
				{
					System.out.println("id: " + id.getId());
					System.out.println("type: " + id.getType());
				}
				System.out.println("##### END OTHERIDS #####");
				System.out.println("sex: " + s.getSex());
				System.out.println("##### BEGIN EMAIL #####");
				System.out.println("emailType: " + s.getEmail().getEmailType());
				System.out.println("emailAddress: " + s.getEmail().getEmailAddress());
				System.out.println("##### END EMAIL #####");
				System.out.println("##### BEGIN PRIMARYASSIGNMENT #####");
				System.out.println("leaRefId: " + s.getPrimaryAssignment().getLeaRefId());
				System.out.println("schoolRefId: " + s.getPrimaryAssignment().getSchoolRefId());
				System.out.println("jobFunction: " + s.getPrimaryAssignment().getJobFunction());
				System.out.println("##### END PRIMARYASSIGNMENT #####");
				System.out.println("##### BEGIN OTHERASSIGNMENT #####");
				for (XStaffPersonAssignmentType pa : s.getOtherAssignments().getStaffPersonAssignment())
				{
					System.out.println("leaRefId: " + pa.getLeaRefId());
					System.out.println("schoolRefId: " + pa.getSchoolRefId());
					System.out.println("jobFunction: " + pa.getJobFunction());
				}
				System.out.println("##### END OTHERASSIGNMENT #####");
				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}
	// RETURN STAFFS BY STUDENT
	public static void XStaffs_GetXStaffsByXStudentLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXSTAFFSBYXSTUDENT, refId); i++)
		{
			for (XStaffType s : xPress.getXStaffsByXStudent(refId).getData())
			{
				System.out.println("refId: " + s.getRefId());
				System.out.println("##### BEGIN NAME #####");
				System.out.println("type: " + s.getName().getType());
				System.out.println("prefix: " + s.getName().getPrefix());
				System.out.println("familyName: " + s.getName().getFamilyName());
				System.out.println("givenName: " + s.getName().getGivenName());
				System.out.println("middleName: " + s.getName().getMiddleName());
				System.out.println("suffix: " + s.getName().getSuffix());
				System.out.println("##### END NAME #####");
				System.out.println("localId: " + s.getLocalId());
				
				System.out.println("stateProvinceId: " + s.getStateProvinceId());
				System.out.println("##### BEGIN OTHERIDS #####");
				for (XOtherPersonIdType id : s.getOtherIds().getOtherId())
				{
					System.out.println("id: " + id.getId());
					System.out.println("type: " + id.getType());
				}
				System.out.println("##### END OTHERIDS #####");
				System.out.println("sex: " + s.getSex());
				System.out.println("##### BEGIN EMAIL #####");
				System.out.println("emailType: " + s.getEmail().getEmailType());
				System.out.println("emailAddress: " + s.getEmail().getEmailAddress());
				System.out.println("##### END EMAIL #####");
				System.out.println("##### BEGIN PRIMARYASSIGNMENT #####");
				System.out.println("leaRefId: " + s.getPrimaryAssignment().getLeaRefId());
				System.out.println("schoolRefId: " + s.getPrimaryAssignment().getSchoolRefId());
				System.out.println("jobFunction: " + s.getPrimaryAssignment().getJobFunction());
				System.out.println("##### END PRIMARYASSIGNMENT #####");
				System.out.println("##### BEGIN OTHERASSIGNMENT #####");
				for (XStaffPersonAssignmentType pa : s.getOtherAssignments().getStaffPersonAssignment())
				{
					System.out.println("leaRefId: " + pa.getLeaRefId());
					System.out.println("schoolRefId: " + pa.getSchoolRefId());
					System.out.println("jobFunction: " + pa.getJobFunction());
				}
				System.out.println("##### END OTHERASSIGNMENT #####");
				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}
 	// #################### xStudents ####################
	// RETURN ALL STUDENTS
	public static void XStudents_GetXStudentsLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXSTUDENTS); i++)
		{
			for (XStudentType s : xPress.getXStudents().getData())
			{
				System.out.println("refId: " + s.getRefId());
				System.out.println("##### BEGIN NAME #####");
				System.out.println("type: " + s.getName().getType());
				System.out.println("prefix: " + s.getName().getPrefix());
				System.out.println("familyName: " + s.getName().getFamilyName());
				System.out.println("givenName: " + s.getName().getGivenName());
				System.out.println("middleName: " + s.getName().getMiddleName());
				System.out.println("suffix: " + s.getName().getSuffix());
				System.out.println("##### END NAME #####");
				System.out.println("##### BEGIN OTHERNAME #####");
				for (XPersonNameType n : s.getOtherNames().getName())
				{
					System.out.println("type: " + n.getType());
					System.out.println("prefix: " + n.getPrefix());
					System.out.println("familyName: " + n.getFamilyName());
					System.out.println("givenName: " + n.getGivenName());
					System.out.println("middleName: " + n.getMiddleName());
					System.out.println("suffix: " + n.getSuffix());
				}
				System.out.println("##### END OTHERNAME #####");

				System.out.println("localId: " + s.getLocalId());
				
				System.out.println("stateProvinceIdloginId: " + s.getStateProvinceId());
				System.out.println("##### BEGIN OTHERIDS #####");
				for (XOtherPersonIdType id : s.getOtherIds().getOtherId())
				{
					System.out.println("id: " + id.getId());
					System.out.println("type: " + id.getType());
				}
				System.out.println("##### END OTHERIDS #####");
				System.out.println("##### BEGIN ADDRESS #####");
				System.out.println("addressType: " + s.getAddress().getAddressType());
				System.out.println("city: " + s.getAddress().getCity());
				System.out.println("line1: " + s.getAddress().getLine1());
				System.out.println("line2: " + s.getAddress().getLine2());
				System.out.println("countryCode: " + s.getAddress().getCountryCode());
				System.out.println("postalCode: " + s.getAddress().getPostalCode());
				System.out.println("stateProvince: " + s.getAddress().getStateProvince());
				System.out.println("number: " + s.getPhoneNumber().getNumber());
				System.out.println("phoneNumberType: " + s.getPhoneNumber().getPhoneNumberType());
				System.out.println("primaryIndicator: " + s.getPhoneNumber().isPrimaryIndicator());
				System.out.println("##### END ADDRESS #####");
				System.out.println("##### BEGIN PHONENUMBERS #####");
				System.out.println("number: " + s.getPhoneNumber().getNumber());
				System.out.println("phoneNumberType: " + s.getPhoneNumber().getPhoneNumberType());
				System.out.println("primaryIndicator: " + s.getPhoneNumber().isPrimaryIndicator());
				System.out.println("##### END PHONENUMBERS #####");
				System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
				for (XTelephoneType p : s.getOtherPhoneNumbers().getPhoneNumber())
				{
					System.out.println("otherPhoneNumbers number: " + p.getNumber());
					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
				}
				System.out.println("##### END OTHERPHONENUMBERS #####");
				System.out.println("##### BEGIN EMAIL #####");
				System.out.println("emailType: " + s.getEmail().getEmailType());
				System.out.println("emailAddress: " + s.getEmail().getEmailAddress());
				System.out.println("##### END EMAIL #####");
				System.out.println("##### BEGIN OTHEREMAILS #####");
				for (XEmailType e : s.getOtherEmails().getEmail())
				{
					System.out.println("emailType: " + e.getEmailType());
					System.out.println("emailAddress: " + e.getEmailAddress());
				}
				System.out.println("##### END OTHEREMAILS #####");
				System.out.println("##### BEGIN DEMOGRAPHICS #####");
				System.out.println("##### BEGIN RACES #####");
				for (XRaceType r : s.getDemographics().getRaces().getRace())
				{
					System.out.println("race: " + r.getRace());
				}
				System.out.println("##### END RACES #####");
				System.out.println("hispanicLatinoEthnicity: " + s.getDemographics().isHispanicLatinoEthnicity());
				System.out.println("sex: " + s.getDemographics().getSex());
				System.out.println("birthDate: " + s.getDemographics().getBirthDate());
				System.out.println("countryOfBirth: " + s.getDemographics().getCountryOfBirth());
				System.out.println("usCitizenshipStatus: " + s.getDemographics().getUsCitizenshipStatus());
				System.out.println("##### END DEMOGRAPHICS #####");
				System.out.println("##### BEGIN ENROLLMENT #####");
				System.out.println("leaRefId: " + s.getEnrollment().getLeaRefId());
				System.out.println("schoolRefId: " + s.getEnrollment().getSchoolRefId());
				System.out.println("studentSchoolAssociationRefId: " + s.getEnrollment().getStudentSchoolAssociationRefId());
				System.out.println("responsibleSchoolType: " + s.getEnrollment().getResponsibleSchoolType());
				System.out.println("membershipType: " + s.getEnrollment().getMembershipType());
				System.out.println("entryDate: " + s.getEnrollment().getEntryDate());
				System.out.println("exitDate: " + s.getEnrollment().getExitDate());
				System.out.println("homeRoomNumber: " + s.getEnrollment().getHomeRoomNumber());
				System.out.println("##### BEGIN HOMEROOMTEACHER #####");
				System.out.println("refId: " + s.getEnrollment().getHomeRoomTeacher().getRefId());
				System.out.println("localId: " + s.getEnrollment().getHomeRoomTeacher().getLocalId());
				System.out.println("givenName: " + s.getEnrollment().getHomeRoomTeacher().getGivenName());
				System.out.println("familyName: " + s.getEnrollment().getHomeRoomTeacher().getFamilyName());
				System.out.println("##### END HOMEROOMTEACHER #####");
				System.out.println("gradeLevel: " + s.getEnrollment().getGradeLevel());
				System.out.println("projectedGraduationYear: " + s.getEnrollment().getProjectedGraduationYear());
				System.out.println("##### BEGIN COUNSELOR #####");
				System.out.println("refId: " + s.getEnrollment().getCounselor().getRefId());
				System.out.println("localId: " + s.getEnrollment().getCounselor().getLocalId());
				System.out.println("givenName: " + s.getEnrollment().getCounselor().getGivenName());
				System.out.println("familyName: " + s.getEnrollment().getCounselor().getFamilyName());
				System.out.println("##### END COUNSELOR #####");
				System.out.println("##### END ENROLLMENT #####");
				System.out.println("##### BEGIN OTHERENROLLMENT #####");
				for (XEnrollmentType e : s.getOtherEnrollments().getEnrollment())
				{
					System.out.println("leaRefId: " + e.getLeaRefId());
					System.out.println("schoolRefId: " + e.getSchoolRefId());
					System.out.println("studentSchoolAssociationRefId: " + e.getStudentSchoolAssociationRefId());
					System.out.println("responsibleSchoolType: " + e.getResponsibleSchoolType());
					System.out.println("membershipType: " + e.getMembershipType());
					System.out.println("entryDate: " + e.getEntryDate());
					System.out.println("exitDate: " + e.getExitDate());
					System.out.println("homeRoomNumber: " + e.getHomeRoomNumber());
					System.out.println("##### BEGIN HOMEROOMTEACHER #####");
					System.out.println("refId: " + e.getHomeRoomTeacher().getRefId());
					System.out.println("localId: " + e.getHomeRoomTeacher().getLocalId());
					System.out.println("givenName: " + e.getHomeRoomTeacher().getGivenName());
					System.out.println("familyName: " + e.getHomeRoomTeacher().getFamilyName());
					System.out.println("##### END HOMEROOMTEACHER #####");
					System.out.println("gradeLevel: " + e.getGradeLevel());
					System.out.println("projectedGraduationYear: " + e.getProjectedGraduationYear());
					System.out.println("##### BEGIN COUNSELOR #####");
					System.out.println("refId: " + e.getCounselor().getRefId());
					System.out.println("localId: " + e.getCounselor().getLocalId());
					System.out.println("givenName: " + e.getCounselor().getGivenName());
					System.out.println("familyName: " + e.getCounselor().getFamilyName());
					System.out.println("##### END COUNSELOR #####");
				}
				System.out.println("##### END OTHERENROLLMENT #####");
				System.out.println("##### BEGIN ACADEMICSUMMARY #####");
				System.out.println("cumulativeWeightedGpa: " + s.getAcademicSummary().getCumulativeWeightedGpa());
				System.out.println("termWeightedGpa: " + s.getAcademicSummary().getTermWeightedGpa());
				System.out.println("classRank: " + s.getAcademicSummary().getClassRank());
				System.out.println("##### END ACADEMICSUMMARY #####");
				System.out.println("##### BEGIN STUDENTCONTACTS #####");
				for (String contactRefid : s.getStudentContacts().getContactPersonRefId())
				{
					System.out.println("contactPersonRefId: " + contactRefid);
				}
				for (XContactType c : s.getStudentContacts().getXContact())
				{
					System.out.println("##### BEGIN NAME #####");
					System.out.println("type: " + c.getName().getType());
					System.out.println("prefix: " + c.getName().getPrefix());
					System.out.println("familyName: " + c.getName().getFamilyName());
					System.out.println("givenName: " + c.getName().getGivenName());
					System.out.println("middleName: " + c.getName().getMiddleName());
					System.out.println("suffix: " + c.getName().getSuffix());
					System.out.println("##### END NAME #####");
					System.out.println("##### BEGIN OTHERNAME #####");
					for (XPersonNameType n : c.getOtherNames().getName())
					{
						System.out.println("type: " + n.getType());
						System.out.println("prefix: " + n.getPrefix());
						System.out.println("familyName: " + n.getFamilyName());
						System.out.println("givenName: " + n.getGivenName());
						System.out.println("middleName: " + n.getMiddleName());
						System.out.println("suffix: " + n.getSuffix());
					}
					System.out.println("##### END OTHERNAME #####");
					System.out.println(": " + c.getLocalId());

					System.out.println("##### BEGIN OTHERIDS #####");
					for (XOtherPersonIdType id : c.getOtherIds().getOtherId())
					{
						System.out.println("id: " + id.getId());
						System.out.println("type: " + id.getType());
					}
					System.out.println("##### END OTHERIDS #####");
					System.out.println("##### BEGIN ADDRESS #####");
					System.out.println("addressType: " + c.getAddress().getAddressType());
					System.out.println("city: " + c.getAddress().getCity());
					System.out.println("line1: " + c.getAddress().getLine1());
					System.out.println("line2: " + c.getAddress().getLine2());
					System.out.println("countryCode: " + c.getAddress().getCountryCode());
					System.out.println("postalCode: " + c.getAddress().getPostalCode());
					System.out.println("stateProvince: " + c.getAddress().getStateProvince());
					System.out.println("number: " + c.getPhoneNumber().getNumber());
					System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
					System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
					System.out.println("##### END ADDRESS #####");
					System.out.println("##### BEGIN PHONENUMBERS #####");
					System.out.println("number: " + c.getPhoneNumber().getNumber());
					System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
					System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
					System.out.println("##### END PHONENUMBERS #####");
					System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
					for (XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber())
					{
						System.out.println("otherPhoneNumbers number: " + p.getNumber());
						System.out.println("phoneNumberType: " + p.getPhoneNumberType());
						System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
					}
					System.out.println("##### END OTHERPHONENUMBERS #####");
					System.out.println("##### BEGIN EMAIL #####");
					System.out.println("emailType: " + c.getEmail().getEmailType());
					System.out.println("emailAddress: " + c.getEmail().getEmailAddress());
					System.out.println("##### END EMAIL #####");
					System.out.println("##### BEGIN OTHEREMAILS #####");
					for (XEmailType e : c.getOtherEmails().getEmail())
					{
						System.out.println("emailType: " + e.getEmailType());
						System.out.println("emailAddress: " + e.getEmailAddress());
					}
					System.out.println("##### END OTHEREMAILS #####");
					System.out.println(": " + c.getSex());
					System.out.println(": " + c.getEmployerType());
					System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
					for (XContactStudentRelationshipType csr : c.getRelationships().getRelationship())
					{
						System.out.println("studentRefId: " + csr.getStudentRefId());
						System.out.println("relationshipCode: " + csr.getRelationshipCode());
						System.out.println("restrictions: " + csr.getRestrictions());
						System.out.println("livesWith: " + csr.isLivesWith());
						System.out.println("primaryContactIndicator: " + csr.isPrimaryContactIndicator());
						System.out.println("emergencyContactIndicator: " + csr.isEmergencyContactIndicator());
						System.out.println("financialResponsibilityIndicator: " + csr.isFinancialResponsibilityIndicator());
						System.out.println("custodialIndicator: " + csr.isCustodialIndicator());
						System.out.println("communicationsIndicator: " + csr.isCommunicationsIndicator());
						System.out.println("contactSequence: " + csr.getContactSequence());
					}
					System.out.println("##### END CONTACTRELATIONSHIPS #####");
				}
				System.out.println("##### END STUDENTCONTACTS #####");
				System.out.println("##### BEGIN LANGUAGES #####");
				for (XLanguageType l : s.getLanguages().getLanguage())
				{
					System.out.println("type: " + l.getType());
					System.out.println("code: " + l.getCode());
				}
				System.out.println("##### END LANGUAGES #####");
				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}

	// RETURN STUDENTS BY LEA
	public static void XStudents_GetXStudentsByXLeaLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXSTUDENTSBYXLEA, refId); i++)
		{
			for (XStudentType s : xPress.getXStudentsByXLea(refId).getData())
			{
				System.out.println("refId: " + s.getRefId());
				System.out.println("##### BEGIN NAME #####");
				System.out.println("type: " + s.getName().getType());
				System.out.println("prefix: " + s.getName().getPrefix());
				System.out.println("familyName: " + s.getName().getFamilyName());
				System.out.println("givenName: " + s.getName().getGivenName());
				System.out.println("middleName: " + s.getName().getMiddleName());
				System.out.println("suffix: " + s.getName().getSuffix());
				System.out.println("##### END NAME #####");
				System.out.println("##### BEGIN OTHERNAME #####");
				for (XPersonNameType n : s.getOtherNames().getName())
				{
					System.out.println("type: " + n.getType());
					System.out.println("prefix: " + n.getPrefix());
					System.out.println("familyName: " + n.getFamilyName());
					System.out.println("givenName: " + n.getGivenName());
					System.out.println("middleName: " + n.getMiddleName());
					System.out.println("suffix: " + n.getSuffix());
				}
				System.out.println("##### END OTHERNAME #####");

				System.out.println("localId: " + s.getLocalId());
				
				System.out.println("stateProvinceIdloginId: " + s.getStateProvinceId());
				System.out.println("##### BEGIN OTHERIDS #####");
				for (XOtherPersonIdType id : s.getOtherIds().getOtherId())
				{
					System.out.println("id: " + id.getId());
					System.out.println("type: " + id.getType());
				}
				System.out.println("##### END OTHERIDS #####");
				System.out.println("##### BEGIN ADDRESS #####");
				System.out.println("addressType: " + s.getAddress().getAddressType());
				System.out.println("city: " + s.getAddress().getCity());
				System.out.println("line1: " + s.getAddress().getLine1());
				System.out.println("line2: " + s.getAddress().getLine2());
				System.out.println("countryCode: " + s.getAddress().getCountryCode());
				System.out.println("postalCode: " + s.getAddress().getPostalCode());
				System.out.println("stateProvince: " + s.getAddress().getStateProvince());
				System.out.println("number: " + s.getPhoneNumber().getNumber());
				System.out.println("phoneNumberType: " + s.getPhoneNumber().getPhoneNumberType());
				System.out.println("primaryIndicator: " + s.getPhoneNumber().isPrimaryIndicator());
				System.out.println("##### END ADDRESS #####");
				System.out.println("##### BEGIN PHONENUMBERS #####");
				System.out.println("number: " + s.getPhoneNumber().getNumber());
				System.out.println("phoneNumberType: " + s.getPhoneNumber().getPhoneNumberType());
				System.out.println("primaryIndicator: " + s.getPhoneNumber().isPrimaryIndicator());
				System.out.println("##### END PHONENUMBERS #####");
				System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
				for (XTelephoneType p : s.getOtherPhoneNumbers().getPhoneNumber())
				{
					System.out.println("otherPhoneNumbers number: " + p.getNumber());
					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
				}
				System.out.println("##### END OTHERPHONENUMBERS #####");
				System.out.println("##### BEGIN EMAIL #####");
				System.out.println("emailType: " + s.getEmail().getEmailType());
				System.out.println("emailAddress: " + s.getEmail().getEmailAddress());
				System.out.println("##### END EMAIL #####");
				System.out.println("##### BEGIN OTHEREMAILS #####");
				for (XEmailType e : s.getOtherEmails().getEmail())
				{
					System.out.println("emailType: " + e.getEmailType());
					System.out.println("emailAddress: " + e.getEmailAddress());
				}
				System.out.println("##### END OTHEREMAILS #####");
				System.out.println("##### BEGIN DEMOGRAPHICS #####");
				System.out.println("##### BEGIN RACES #####");
				for (XRaceType r : s.getDemographics().getRaces().getRace())
				{
					System.out.println("race: " + r.getRace());
				}
				System.out.println("##### END RACES #####");
				System.out.println("hispanicLatinoEthnicity: " + s.getDemographics().isHispanicLatinoEthnicity());
				System.out.println("sex: " + s.getDemographics().getSex());
				System.out.println("birthDate: " + s.getDemographics().getBirthDate());
				System.out.println("countryOfBirth: " + s.getDemographics().getCountryOfBirth());
				System.out.println("usCitizenshipStatus: " + s.getDemographics().getUsCitizenshipStatus());
				System.out.println("##### END DEMOGRAPHICS #####");
				System.out.println("##### BEGIN ENROLLMENT #####");
				System.out.println("leaRefId: " + s.getEnrollment().getLeaRefId());
				System.out.println("schoolRefId: " + s.getEnrollment().getSchoolRefId());
				System.out.println("studentSchoolAssociationRefId: " + s.getEnrollment().getStudentSchoolAssociationRefId());
				System.out.println("responsibleSchoolType: " + s.getEnrollment().getResponsibleSchoolType());
				System.out.println("membershipType: " + s.getEnrollment().getMembershipType());
				System.out.println("entryDate: " + s.getEnrollment().getEntryDate());
				System.out.println("exitDate: " + s.getEnrollment().getExitDate());
				System.out.println("homeRoomNumber: " + s.getEnrollment().getHomeRoomNumber());
				System.out.println("##### BEGIN HOMEROOMTEACHER #####");
				System.out.println("refId: " + s.getEnrollment().getHomeRoomTeacher().getRefId());
				System.out.println("localId: " + s.getEnrollment().getHomeRoomTeacher().getLocalId());
				System.out.println("givenName: " + s.getEnrollment().getHomeRoomTeacher().getGivenName());
				System.out.println("familyName: " + s.getEnrollment().getHomeRoomTeacher().getFamilyName());
				System.out.println("##### END HOMEROOMTEACHER #####");
				System.out.println("gradeLevel: " + s.getEnrollment().getGradeLevel());
				System.out.println("projectedGraduationYear: " + s.getEnrollment().getProjectedGraduationYear());
				System.out.println("##### BEGIN COUNSELOR #####");
				System.out.println("refId: " + s.getEnrollment().getCounselor().getRefId());
				System.out.println("localId: " + s.getEnrollment().getCounselor().getLocalId());
				System.out.println("givenName: " + s.getEnrollment().getCounselor().getGivenName());
				System.out.println("familyName: " + s.getEnrollment().getCounselor().getFamilyName());
				System.out.println("##### END COUNSELOR #####");
				System.out.println("##### END ENROLLMENT #####");
				System.out.println("##### BEGIN OTHERENROLLMENT #####");
				for (XEnrollmentType e : s.getOtherEnrollments().getEnrollment())
				{
					System.out.println("leaRefId: " + e.getLeaRefId());
					System.out.println("schoolRefId: " + e.getSchoolRefId());
					System.out.println("studentSchoolAssociationRefId: " + e.getStudentSchoolAssociationRefId());
					System.out.println("responsibleSchoolType: " + e.getResponsibleSchoolType());
					System.out.println("membershipType: " + e.getMembershipType());
					System.out.println("entryDate: " + e.getEntryDate());
					System.out.println("exitDate: " + e.getExitDate());
					System.out.println("homeRoomNumber: " + e.getHomeRoomNumber());
					System.out.println("##### BEGIN HOMEROOMTEACHER #####");
					System.out.println("refId: " + e.getHomeRoomTeacher().getRefId());
					System.out.println("localId: " + e.getHomeRoomTeacher().getLocalId());
					System.out.println("givenName: " + e.getHomeRoomTeacher().getGivenName());
					System.out.println("familyName: " + e.getHomeRoomTeacher().getFamilyName());
					System.out.println("##### END HOMEROOMTEACHER #####");
					System.out.println("gradeLevel: " + e.getGradeLevel());
					System.out.println("projectedGraduationYear: " + e.getProjectedGraduationYear());
					System.out.println("##### BEGIN COUNSELOR #####");
					System.out.println("refId: " + e.getCounselor().getRefId());
					System.out.println("localId: " + e.getCounselor().getLocalId());
					System.out.println("givenName: " + e.getCounselor().getGivenName());
					System.out.println("familyName: " + e.getCounselor().getFamilyName());
					System.out.println("##### END COUNSELOR #####");
				}
				System.out.println("##### END OTHERENROLLMENT #####");
				System.out.println("##### BEGIN ACADEMICSUMMARY #####");
				System.out.println("cumulativeWeightedGpa: " + s.getAcademicSummary().getCumulativeWeightedGpa());
				System.out.println("termWeightedGpa: " + s.getAcademicSummary().getTermWeightedGpa());
				System.out.println("classRank: " + s.getAcademicSummary().getClassRank());
				System.out.println("##### END ACADEMICSUMMARY #####");
				System.out.println("##### BEGIN STUDENTCONTACTS #####");
				for (String contactRefid : s.getStudentContacts().getContactPersonRefId())
				{
					System.out.println("contactPersonRefId: " + contactRefid);
				}
				for (XContactType c : s.getStudentContacts().getXContact())
				{
					System.out.println("##### BEGIN NAME #####");
					System.out.println("type: " + c.getName().getType());
					System.out.println("prefix: " + c.getName().getPrefix());
					System.out.println("familyName: " + c.getName().getFamilyName());
					System.out.println("givenName: " + c.getName().getGivenName());
					System.out.println("middleName: " + c.getName().getMiddleName());
					System.out.println("suffix: " + c.getName().getSuffix());
					System.out.println("##### END NAME #####");
					System.out.println("##### BEGIN OTHERNAME #####");
					for (XPersonNameType n : c.getOtherNames().getName())
					{
						System.out.println("type: " + n.getType());
						System.out.println("prefix: " + n.getPrefix());
						System.out.println("familyName: " + n.getFamilyName());
						System.out.println("givenName: " + n.getGivenName());
						System.out.println("middleName: " + n.getMiddleName());
						System.out.println("suffix: " + n.getSuffix());
					}
					System.out.println("##### END OTHERNAME #####");
					System.out.println(": " + c.getLocalId());

					System.out.println("##### BEGIN OTHERIDS #####");
					for (XOtherPersonIdType id : c.getOtherIds().getOtherId())
					{
						System.out.println("id: " + id.getId());
						System.out.println("type: " + id.getType());
					}
					System.out.println("##### END OTHERIDS #####");
					System.out.println("##### BEGIN ADDRESS #####");
					System.out.println("addressType: " + c.getAddress().getAddressType());
					System.out.println("city: " + c.getAddress().getCity());
					System.out.println("line1: " + c.getAddress().getLine1());
					System.out.println("line2: " + c.getAddress().getLine2());
					System.out.println("countryCode: " + c.getAddress().getCountryCode());
					System.out.println("postalCode: " + c.getAddress().getPostalCode());
					System.out.println("stateProvince: " + c.getAddress().getStateProvince());
					System.out.println("number: " + c.getPhoneNumber().getNumber());
					System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
					System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
					System.out.println("##### END ADDRESS #####");
					System.out.println("##### BEGIN PHONENUMBERS #####");
					System.out.println("number: " + c.getPhoneNumber().getNumber());
					System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
					System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
					System.out.println("##### END PHONENUMBERS #####");
					System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
					for (XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber())
					{
						System.out.println("otherPhoneNumbers number: " + p.getNumber());
						System.out.println("phoneNumberType: " + p.getPhoneNumberType());
						System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
					}
					System.out.println("##### END OTHERPHONENUMBERS #####");
					System.out.println("##### BEGIN EMAIL #####");
					System.out.println("emailType: " + c.getEmail().getEmailType());
					System.out.println("emailAddress: " + c.getEmail().getEmailAddress());
					System.out.println("##### END EMAIL #####");
					System.out.println("##### BEGIN OTHEREMAILS #####");
					for (XEmailType e : c.getOtherEmails().getEmail())
					{
						System.out.println("emailType: " + e.getEmailType());
						System.out.println("emailAddress: " + e.getEmailAddress());
					}
					System.out.println("##### END OTHEREMAILS #####");
					System.out.println(": " + c.getSex());
					System.out.println(": " + c.getEmployerType());
					System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
					for (XContactStudentRelationshipType csr : c.getRelationships().getRelationship())
					{
						System.out.println("studentRefId: " + csr.getStudentRefId());
						System.out.println("relationshipCode: " + csr.getRelationshipCode());
						System.out.println("restrictions: " + csr.getRestrictions());
						System.out.println("livesWith: " + csr.isLivesWith());
						System.out.println("primaryContactIndicator: " + csr.isPrimaryContactIndicator());
						System.out.println("emergencyContactIndicator: " + csr.isEmergencyContactIndicator());
						System.out.println("financialResponsibilityIndicator: " + csr.isFinancialResponsibilityIndicator());
						System.out.println("custodialIndicator: " + csr.isCustodialIndicator());
						System.out.println("communicationsIndicator: " + csr.isCommunicationsIndicator());
						System.out.println("contactSequence: " + csr.getContactSequence());
					}
					System.out.println("##### END CONTACTRELATIONSHIPS #####");
				}
				System.out.println("##### END STUDENTCONTACTS #####");
				System.out.println("##### BEGIN LANGUAGES #####");
				for (XLanguageType l : s.getLanguages().getLanguage())
				{
					System.out.println("type: " + l.getType());
					System.out.println("code: " + l.getCode());
				}
				System.out.println("##### END LANGUAGES #####");
				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}

	// RETURN STUDENTS BY SCHOOL
	public static void XStudents_GetXStudentsByXSchoolLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXSTUDENTSBYXSCHOOL, refId); i++)
		{
			for (XStudentType s : xPress.getXStudentsByXSchool(refId).getData())
			{
				System.out.println("refId: " + s.getRefId());
				System.out.println("##### BEGIN NAME #####");
				System.out.println("type: " + s.getName().getType());
				System.out.println("prefix: " + s.getName().getPrefix());
				System.out.println("familyName: " + s.getName().getFamilyName());
				System.out.println("givenName: " + s.getName().getGivenName());
				System.out.println("middleName: " + s.getName().getMiddleName());
				System.out.println("suffix: " + s.getName().getSuffix());
				System.out.println("##### END NAME #####");
				System.out.println("##### BEGIN OTHERNAME #####");
				for (XPersonNameType n : s.getOtherNames().getName())
				{
					System.out.println("type: " + n.getType());
					System.out.println("prefix: " + n.getPrefix());
					System.out.println("familyName: " + n.getFamilyName());
					System.out.println("givenName: " + n.getGivenName());
					System.out.println("middleName: " + n.getMiddleName());
					System.out.println("suffix: " + n.getSuffix());
				}
				System.out.println("##### END OTHERNAME #####");

				System.out.println("localId: " + s.getLocalId());
				
				System.out.println("stateProvinceIdloginId: " + s.getStateProvinceId());
				System.out.println("##### BEGIN OTHERIDS #####");
				for (XOtherPersonIdType id : s.getOtherIds().getOtherId())
				{
					System.out.println("id: " + id.getId());
					System.out.println("type: " + id.getType());
				}
				System.out.println("##### END OTHERIDS #####");
				System.out.println("##### BEGIN ADDRESS #####");
				System.out.println("addressType: " + s.getAddress().getAddressType());
				System.out.println("city: " + s.getAddress().getCity());
				System.out.println("line1: " + s.getAddress().getLine1());
				System.out.println("line2: " + s.getAddress().getLine2());
				System.out.println("countryCode: " + s.getAddress().getCountryCode());
				System.out.println("postalCode: " + s.getAddress().getPostalCode());
				System.out.println("stateProvince: " + s.getAddress().getStateProvince());
				System.out.println("number: " + s.getPhoneNumber().getNumber());
				System.out.println("phoneNumberType: " + s.getPhoneNumber().getPhoneNumberType());
				System.out.println("primaryIndicator: " + s.getPhoneNumber().isPrimaryIndicator());
				System.out.println("##### END ADDRESS #####");
				System.out.println("##### BEGIN PHONENUMBERS #####");
				System.out.println("number: " + s.getPhoneNumber().getNumber());
				System.out.println("phoneNumberType: " + s.getPhoneNumber().getPhoneNumberType());
				System.out.println("primaryIndicator: " + s.getPhoneNumber().isPrimaryIndicator());
				System.out.println("##### END PHONENUMBERS #####");
				System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
				for (XTelephoneType p : s.getOtherPhoneNumbers().getPhoneNumber())
				{
					System.out.println("otherPhoneNumbers number: " + p.getNumber());
					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
				}
				System.out.println("##### END OTHERPHONENUMBERS #####");
				System.out.println("##### BEGIN EMAIL #####");
				System.out.println("emailType: " + s.getEmail().getEmailType());
				System.out.println("emailAddress: " + s.getEmail().getEmailAddress());
				System.out.println("##### END EMAIL #####");
				System.out.println("##### BEGIN OTHEREMAILS #####");
				for (XEmailType e : s.getOtherEmails().getEmail())
				{
					System.out.println("emailType: " + e.getEmailType());
					System.out.println("emailAddress: " + e.getEmailAddress());
				}
				System.out.println("##### END OTHEREMAILS #####");
				System.out.println("##### BEGIN DEMOGRAPHICS #####");
				System.out.println("##### BEGIN RACES #####");
				for (XRaceType r : s.getDemographics().getRaces().getRace())
				{
					System.out.println("race: " + r.getRace());
				}
				System.out.println("##### END RACES #####");
				System.out.println("hispanicLatinoEthnicity: " + s.getDemographics().isHispanicLatinoEthnicity());
				System.out.println("sex: " + s.getDemographics().getSex());
				System.out.println("birthDate: " + s.getDemographics().getBirthDate());
				System.out.println("countryOfBirth: " + s.getDemographics().getCountryOfBirth());
				System.out.println("usCitizenshipStatus: " + s.getDemographics().getUsCitizenshipStatus());
				System.out.println("##### END DEMOGRAPHICS #####");
				System.out.println("##### BEGIN ENROLLMENT #####");
				System.out.println("leaRefId: " + s.getEnrollment().getLeaRefId());
				System.out.println("schoolRefId: " + s.getEnrollment().getSchoolRefId());
				System.out.println("studentSchoolAssociationRefId: " + s.getEnrollment().getStudentSchoolAssociationRefId());
				System.out.println("responsibleSchoolType: " + s.getEnrollment().getResponsibleSchoolType());
				System.out.println("membershipType: " + s.getEnrollment().getMembershipType());
				System.out.println("entryDate: " + s.getEnrollment().getEntryDate());
				System.out.println("exitDate: " + s.getEnrollment().getExitDate());
				System.out.println("homeRoomNumber: " + s.getEnrollment().getHomeRoomNumber());
				System.out.println("##### BEGIN HOMEROOMTEACHER #####");
				System.out.println("refId: " + s.getEnrollment().getHomeRoomTeacher().getRefId());
				System.out.println("localId: " + s.getEnrollment().getHomeRoomTeacher().getLocalId());
				System.out.println("givenName: " + s.getEnrollment().getHomeRoomTeacher().getGivenName());
				System.out.println("familyName: " + s.getEnrollment().getHomeRoomTeacher().getFamilyName());
				System.out.println("##### END HOMEROOMTEACHER #####");
				System.out.println("gradeLevel: " + s.getEnrollment().getGradeLevel());
				System.out.println("projectedGraduationYear: " + s.getEnrollment().getProjectedGraduationYear());
				System.out.println("##### BEGIN COUNSELOR #####");
				System.out.println("refId: " + s.getEnrollment().getCounselor().getRefId());
				System.out.println("localId: " + s.getEnrollment().getCounselor().getLocalId());
				System.out.println("givenName: " + s.getEnrollment().getCounselor().getGivenName());
				System.out.println("familyName: " + s.getEnrollment().getCounselor().getFamilyName());
				System.out.println("##### END COUNSELOR #####");
				System.out.println("##### END ENROLLMENT #####");
				System.out.println("##### BEGIN OTHERENROLLMENT #####");
				for (XEnrollmentType e : s.getOtherEnrollments().getEnrollment())
				{
					System.out.println("leaRefId: " + e.getLeaRefId());
					System.out.println("schoolRefId: " + e.getSchoolRefId());
					System.out.println("studentSchoolAssociationRefId: " + e.getStudentSchoolAssociationRefId());
					System.out.println("responsibleSchoolType: " + e.getResponsibleSchoolType());
					System.out.println("membershipType: " + e.getMembershipType());
					System.out.println("entryDate: " + e.getEntryDate());
					System.out.println("exitDate: " + e.getExitDate());
					System.out.println("homeRoomNumber: " + e.getHomeRoomNumber());
					System.out.println("##### BEGIN HOMEROOMTEACHER #####");
					System.out.println("refId: " + e.getHomeRoomTeacher().getRefId());
					System.out.println("localId: " + e.getHomeRoomTeacher().getLocalId());
					System.out.println("givenName: " + e.getHomeRoomTeacher().getGivenName());
					System.out.println("familyName: " + e.getHomeRoomTeacher().getFamilyName());
					System.out.println("##### END HOMEROOMTEACHER #####");
					System.out.println("gradeLevel: " + e.getGradeLevel());
					System.out.println("projectedGraduationYear: " + e.getProjectedGraduationYear());
					System.out.println("##### BEGIN COUNSELOR #####");
					System.out.println("refId: " + e.getCounselor().getRefId());
					System.out.println("localId: " + e.getCounselor().getLocalId());
					System.out.println("givenName: " + e.getCounselor().getGivenName());
					System.out.println("familyName: " + e.getCounselor().getFamilyName());
					System.out.println("##### END COUNSELOR #####");
				}
				System.out.println("##### END OTHERENROLLMENT #####");
				System.out.println("##### BEGIN ACADEMICSUMMARY #####");
				System.out.println("cumulativeWeightedGpa: " + s.getAcademicSummary().getCumulativeWeightedGpa());
				System.out.println("termWeightedGpa: " + s.getAcademicSummary().getTermWeightedGpa());
				System.out.println("classRank: " + s.getAcademicSummary().getClassRank());
				System.out.println("##### END ACADEMICSUMMARY #####");
				System.out.println("##### BEGIN STUDENTCONTACTS #####");
				for (String contactRefid : s.getStudentContacts().getContactPersonRefId())
				{
					System.out.println("contactPersonRefId: " + contactRefid);
				}
				for (XContactType c : s.getStudentContacts().getXContact())
				{
					System.out.println("##### BEGIN NAME #####");
					System.out.println("type: " + c.getName().getType());
					System.out.println("prefix: " + c.getName().getPrefix());
					System.out.println("familyName: " + c.getName().getFamilyName());
					System.out.println("givenName: " + c.getName().getGivenName());
					System.out.println("middleName: " + c.getName().getMiddleName());
					System.out.println("suffix: " + c.getName().getSuffix());
					System.out.println("##### END NAME #####");
					System.out.println("##### BEGIN OTHERNAME #####");
					for (XPersonNameType n : c.getOtherNames().getName())
					{
						System.out.println("type: " + n.getType());
						System.out.println("prefix: " + n.getPrefix());
						System.out.println("familyName: " + n.getFamilyName());
						System.out.println("givenName: " + n.getGivenName());
						System.out.println("middleName: " + n.getMiddleName());
						System.out.println("suffix: " + n.getSuffix());
					}
					System.out.println("##### END OTHERNAME #####");
					System.out.println(": " + c.getLocalId());

					System.out.println("##### BEGIN OTHERIDS #####");
					for (XOtherPersonIdType id : c.getOtherIds().getOtherId())
					{
						System.out.println("id: " + id.getId());
						System.out.println("type: " + id.getType());
					}
					System.out.println("##### END OTHERIDS #####");
					System.out.println("##### BEGIN ADDRESS #####");
					System.out.println("addressType: " + c.getAddress().getAddressType());
					System.out.println("city: " + c.getAddress().getCity());
					System.out.println("line1: " + c.getAddress().getLine1());
					System.out.println("line2: " + c.getAddress().getLine2());
					System.out.println("countryCode: " + c.getAddress().getCountryCode());
					System.out.println("postalCode: " + c.getAddress().getPostalCode());
					System.out.println("stateProvince: " + c.getAddress().getStateProvince());
					System.out.println("number: " + c.getPhoneNumber().getNumber());
					System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
					System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
					System.out.println("##### END ADDRESS #####");
					System.out.println("##### BEGIN PHONENUMBERS #####");
					System.out.println("number: " + c.getPhoneNumber().getNumber());
					System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
					System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
					System.out.println("##### END PHONENUMBERS #####");
					System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
					for (XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber())
					{
						System.out.println("otherPhoneNumbers number: " + p.getNumber());
						System.out.println("phoneNumberType: " + p.getPhoneNumberType());
						System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
					}
					System.out.println("##### END OTHERPHONENUMBERS #####");
					System.out.println("##### BEGIN EMAIL #####");
					System.out.println("emailType: " + c.getEmail().getEmailType());
					System.out.println("emailAddress: " + c.getEmail().getEmailAddress());
					System.out.println("##### END EMAIL #####");
					System.out.println("##### BEGIN OTHEREMAILS #####");
					for (XEmailType e : c.getOtherEmails().getEmail())
					{
						System.out.println("emailType: " + e.getEmailType());
						System.out.println("emailAddress: " + e.getEmailAddress());
					}
					System.out.println("##### END OTHEREMAILS #####");
					System.out.println(": " + c.getSex());
					System.out.println(": " + c.getEmployerType());
					System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
					for (XContactStudentRelationshipType csr : c.getRelationships().getRelationship())
					{
						System.out.println("studentRefId: " + csr.getStudentRefId());
						System.out.println("relationshipCode: " + csr.getRelationshipCode());
						System.out.println("restrictions: " + csr.getRestrictions());
						System.out.println("livesWith: " + csr.isLivesWith());
						System.out.println("primaryContactIndicator: " + csr.isPrimaryContactIndicator());
						System.out.println("emergencyContactIndicator: " + csr.isEmergencyContactIndicator());
						System.out.println("financialResponsibilityIndicator: " + csr.isFinancialResponsibilityIndicator());
						System.out.println("custodialIndicator: " + csr.isCustodialIndicator());
						System.out.println("communicationsIndicator: " + csr.isCommunicationsIndicator());
						System.out.println("contactSequence: " + csr.getContactSequence());
					}
					System.out.println("##### END CONTACTRELATIONSHIPS #####");
				}
				System.out.println("##### END STUDENTCONTACTS #####");
				System.out.println("##### BEGIN LANGUAGES #####");
				for (XLanguageType l : s.getLanguages().getLanguage())
				{
					System.out.println("type: " + l.getType());
					System.out.println("code: " + l.getCode());
				}
				System.out.println("##### END LANGUAGES #####");
				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}

	// RETURN STUDENTS BY ROSTER
	public static void XStudents_GetXStudentsByXRosterLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXSTUDENTSBYXROSTER, refId); i++)
		{
			for (XStudentType s : xPress.getXStudentsByXRoster(refId).getData())
			{
				System.out.println("refId: " + s.getRefId());
				System.out.println("##### BEGIN NAME #####");
				System.out.println("type: " + s.getName().getType());
				System.out.println("prefix: " + s.getName().getPrefix());
				System.out.println("familyName: " + s.getName().getFamilyName());
				System.out.println("givenName: " + s.getName().getGivenName());
				System.out.println("middleName: " + s.getName().getMiddleName());
				System.out.println("suffix: " + s.getName().getSuffix());
				System.out.println("##### END NAME #####");
				System.out.println("##### BEGIN OTHERNAME #####");
				for (XPersonNameType n : s.getOtherNames().getName())
				{
					System.out.println("type: " + n.getType());
					System.out.println("prefix: " + n.getPrefix());
					System.out.println("familyName: " + n.getFamilyName());
					System.out.println("givenName: " + n.getGivenName());
					System.out.println("middleName: " + n.getMiddleName());
					System.out.println("suffix: " + n.getSuffix());
				}
				System.out.println("##### END OTHERNAME #####");

				System.out.println("localId: " + s.getLocalId());
				
				System.out.println("stateProvinceIdloginId: " + s.getStateProvinceId());
				System.out.println("##### BEGIN OTHERIDS #####");
				for (XOtherPersonIdType id : s.getOtherIds().getOtherId())
				{
					System.out.println("id: " + id.getId());
					System.out.println("type: " + id.getType());
				}
				System.out.println("##### END OTHERIDS #####");
				System.out.println("##### BEGIN ADDRESS #####");
				System.out.println("addressType: " + s.getAddress().getAddressType());
				System.out.println("city: " + s.getAddress().getCity());
				System.out.println("line1: " + s.getAddress().getLine1());
				System.out.println("line2: " + s.getAddress().getLine2());
				System.out.println("countryCode: " + s.getAddress().getCountryCode());
				System.out.println("postalCode: " + s.getAddress().getPostalCode());
				System.out.println("stateProvince: " + s.getAddress().getStateProvince());
				System.out.println("number: " + s.getPhoneNumber().getNumber());
				System.out.println("phoneNumberType: " + s.getPhoneNumber().getPhoneNumberType());
				System.out.println("primaryIndicator: " + s.getPhoneNumber().isPrimaryIndicator());
				System.out.println("##### END ADDRESS #####");
				System.out.println("##### BEGIN PHONENUMBERS #####");
				System.out.println("number: " + s.getPhoneNumber().getNumber());
				System.out.println("phoneNumberType: " + s.getPhoneNumber().getPhoneNumberType());
				System.out.println("primaryIndicator: " + s.getPhoneNumber().isPrimaryIndicator());
				System.out.println("##### END PHONENUMBERS #####");
				System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
				for (XTelephoneType p : s.getOtherPhoneNumbers().getPhoneNumber())
				{
					System.out.println("otherPhoneNumbers number: " + p.getNumber());
					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
				}
				System.out.println("##### END OTHERPHONENUMBERS #####");
				System.out.println("##### BEGIN EMAIL #####");
				System.out.println("emailType: " + s.getEmail().getEmailType());
				System.out.println("emailAddress: " + s.getEmail().getEmailAddress());
				System.out.println("##### END EMAIL #####");
				System.out.println("##### BEGIN OTHEREMAILS #####");
				for (XEmailType e : s.getOtherEmails().getEmail())
				{
					System.out.println("emailType: " + e.getEmailType());
					System.out.println("emailAddress: " + e.getEmailAddress());
				}
				System.out.println("##### END OTHEREMAILS #####");
				System.out.println("##### BEGIN DEMOGRAPHICS #####");
				System.out.println("##### BEGIN RACES #####");
				for (XRaceType r : s.getDemographics().getRaces().getRace())
				{
					System.out.println("race: " + r.getRace());
				}
				System.out.println("##### END RACES #####");
				System.out.println("hispanicLatinoEthnicity: " + s.getDemographics().isHispanicLatinoEthnicity());
				System.out.println("sex: " + s.getDemographics().getSex());
				System.out.println("birthDate: " + s.getDemographics().getBirthDate());
				System.out.println("countryOfBirth: " + s.getDemographics().getCountryOfBirth());
				System.out.println("usCitizenshipStatus: " + s.getDemographics().getUsCitizenshipStatus());
				System.out.println("##### END DEMOGRAPHICS #####");
				System.out.println("##### BEGIN ENROLLMENT #####");
				System.out.println("leaRefId: " + s.getEnrollment().getLeaRefId());
				System.out.println("schoolRefId: " + s.getEnrollment().getSchoolRefId());
				System.out.println("studentSchoolAssociationRefId: " + s.getEnrollment().getStudentSchoolAssociationRefId());
				System.out.println("responsibleSchoolType: " + s.getEnrollment().getResponsibleSchoolType());
				System.out.println("membershipType: " + s.getEnrollment().getMembershipType());
				System.out.println("entryDate: " + s.getEnrollment().getEntryDate());
				System.out.println("exitDate: " + s.getEnrollment().getExitDate());
				System.out.println("homeRoomNumber: " + s.getEnrollment().getHomeRoomNumber());
				System.out.println("##### BEGIN HOMEROOMTEACHER #####");
				System.out.println("refId: " + s.getEnrollment().getHomeRoomTeacher().getRefId());
				System.out.println("localId: " + s.getEnrollment().getHomeRoomTeacher().getLocalId());
				System.out.println("givenName: " + s.getEnrollment().getHomeRoomTeacher().getGivenName());
				System.out.println("familyName: " + s.getEnrollment().getHomeRoomTeacher().getFamilyName());
				System.out.println("##### END HOMEROOMTEACHER #####");
				System.out.println("gradeLevel: " + s.getEnrollment().getGradeLevel());
				System.out.println("projectedGraduationYear: " + s.getEnrollment().getProjectedGraduationYear());
				System.out.println("##### BEGIN COUNSELOR #####");
				System.out.println("refId: " + s.getEnrollment().getCounselor().getRefId());
				System.out.println("localId: " + s.getEnrollment().getCounselor().getLocalId());
				System.out.println("givenName: " + s.getEnrollment().getCounselor().getGivenName());
				System.out.println("familyName: " + s.getEnrollment().getCounselor().getFamilyName());
				System.out.println("##### END COUNSELOR #####");
				System.out.println("##### END ENROLLMENT #####");
				System.out.println("##### BEGIN OTHERENROLLMENT #####");
				for (XEnrollmentType e : s.getOtherEnrollments().getEnrollment())
				{
					System.out.println("leaRefId: " + e.getLeaRefId());
					System.out.println("schoolRefId: " + e.getSchoolRefId());
					System.out.println("studentSchoolAssociationRefId: " + e.getStudentSchoolAssociationRefId());
					System.out.println("responsibleSchoolType: " + e.getResponsibleSchoolType());
					System.out.println("membershipType: " + e.getMembershipType());
					System.out.println("entryDate: " + e.getEntryDate());
					System.out.println("exitDate: " + e.getExitDate());
					System.out.println("homeRoomNumber: " + e.getHomeRoomNumber());
					System.out.println("##### BEGIN HOMEROOMTEACHER #####");
					System.out.println("refId: " + e.getHomeRoomTeacher().getRefId());
					System.out.println("localId: " + e.getHomeRoomTeacher().getLocalId());
					System.out.println("givenName: " + e.getHomeRoomTeacher().getGivenName());
					System.out.println("familyName: " + e.getHomeRoomTeacher().getFamilyName());
					System.out.println("##### END HOMEROOMTEACHER #####");
					System.out.println("gradeLevel: " + e.getGradeLevel());
					System.out.println("projectedGraduationYear: " + e.getProjectedGraduationYear());
					System.out.println("##### BEGIN COUNSELOR #####");
					System.out.println("refId: " + e.getCounselor().getRefId());
					System.out.println("localId: " + e.getCounselor().getLocalId());
					System.out.println("givenName: " + e.getCounselor().getGivenName());
					System.out.println("familyName: " + e.getCounselor().getFamilyName());
					System.out.println("##### END COUNSELOR #####");
				}
				System.out.println("##### END OTHERENROLLMENT #####");
				System.out.println("##### BEGIN ACADEMICSUMMARY #####");
				System.out.println("cumulativeWeightedGpa: " + s.getAcademicSummary().getCumulativeWeightedGpa());
				System.out.println("termWeightedGpa: " + s.getAcademicSummary().getTermWeightedGpa());
				System.out.println("classRank: " + s.getAcademicSummary().getClassRank());
				System.out.println("##### END ACADEMICSUMMARY #####");
				System.out.println("##### BEGIN STUDENTCONTACTS #####");
				for (String contactRefid : s.getStudentContacts().getContactPersonRefId())
				{
					System.out.println("contactPersonRefId: " + contactRefid);
				}
				for (XContactType c : s.getStudentContacts().getXContact())
				{
					System.out.println("##### BEGIN NAME #####");
					System.out.println("type: " + c.getName().getType());
					System.out.println("prefix: " + c.getName().getPrefix());
					System.out.println("familyName: " + c.getName().getFamilyName());
					System.out.println("givenName: " + c.getName().getGivenName());
					System.out.println("middleName: " + c.getName().getMiddleName());
					System.out.println("suffix: " + c.getName().getSuffix());
					System.out.println("##### END NAME #####");
					System.out.println("##### BEGIN OTHERNAME #####");
					for (XPersonNameType n : c.getOtherNames().getName())
					{
						System.out.println("type: " + n.getType());
						System.out.println("prefix: " + n.getPrefix());
						System.out.println("familyName: " + n.getFamilyName());
						System.out.println("givenName: " + n.getGivenName());
						System.out.println("middleName: " + n.getMiddleName());
						System.out.println("suffix: " + n.getSuffix());
					}
					System.out.println("##### END OTHERNAME #####");
					System.out.println(": " + c.getLocalId());

					System.out.println("##### BEGIN OTHERIDS #####");
					for (XOtherPersonIdType id : c.getOtherIds().getOtherId())
					{
						System.out.println("id: " + id.getId());
						System.out.println("type: " + id.getType());
					}
					System.out.println("##### END OTHERIDS #####");
					System.out.println("##### BEGIN ADDRESS #####");
					System.out.println("addressType: " + c.getAddress().getAddressType());
					System.out.println("city: " + c.getAddress().getCity());
					System.out.println("line1: " + c.getAddress().getLine1());
					System.out.println("line2: " + c.getAddress().getLine2());
					System.out.println("countryCode: " + c.getAddress().getCountryCode());
					System.out.println("postalCode: " + c.getAddress().getPostalCode());
					System.out.println("stateProvince: " + c.getAddress().getStateProvince());
					System.out.println("number: " + c.getPhoneNumber().getNumber());
					System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
					System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
					System.out.println("##### END ADDRESS #####");
					System.out.println("##### BEGIN PHONENUMBERS #####");
					System.out.println("number: " + c.getPhoneNumber().getNumber());
					System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
					System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
					System.out.println("##### END PHONENUMBERS #####");
					System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
					for (XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber())
					{
						System.out.println("otherPhoneNumbers number: " + p.getNumber());
						System.out.println("phoneNumberType: " + p.getPhoneNumberType());
						System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
					}
					System.out.println("##### END OTHERPHONENUMBERS #####");
					System.out.println("##### BEGIN EMAIL #####");
					System.out.println("emailType: " + c.getEmail().getEmailType());
					System.out.println("emailAddress: " + c.getEmail().getEmailAddress());
					System.out.println("##### END EMAIL #####");
					System.out.println("##### BEGIN OTHEREMAILS #####");
					for (XEmailType e : c.getOtherEmails().getEmail())
					{
						System.out.println("emailType: " + e.getEmailType());
						System.out.println("emailAddress: " + e.getEmailAddress());
					}
					System.out.println("##### END OTHEREMAILS #####");
					System.out.println(": " + c.getSex());
					System.out.println(": " + c.getEmployerType());
					System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
					for (XContactStudentRelationshipType csr : c.getRelationships().getRelationship())
					{
						System.out.println("studentRefId: " + csr.getStudentRefId());
						System.out.println("relationshipCode: " + csr.getRelationshipCode());
						System.out.println("restrictions: " + csr.getRestrictions());
						System.out.println("livesWith: " + csr.isLivesWith());
						System.out.println("primaryContactIndicator: " + csr.isPrimaryContactIndicator());
						System.out.println("emergencyContactIndicator: " + csr.isEmergencyContactIndicator());
						System.out.println("financialResponsibilityIndicator: " + csr.isFinancialResponsibilityIndicator());
						System.out.println("custodialIndicator: " + csr.isCustodialIndicator());
						System.out.println("communicationsIndicator: " + csr.isCommunicationsIndicator());
						System.out.println("contactSequence: " + csr.getContactSequence());
					}
					System.out.println("##### END CONTACTRELATIONSHIPS #####");
				}
				System.out.println("##### END STUDENTCONTACTS #####");
				System.out.println("##### BEGIN LANGUAGES #####");
				for (XLanguageType l : s.getLanguages().getLanguage())
				{
					System.out.println("type: " + l.getType());
					System.out.println("code: " + l.getCode());
				}
				System.out.println("##### END LANGUAGES #####");
				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}

	// RETURN STUDENTS BY STAFF
	public static void XStudents_GetXStudentsByXStaffLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXSTUDENTSBYXSTAFF, refId); i++)
		{
			for (XStudentType s : xPress.getXStudentsByXStaff(refId).getData())
			{
				System.out.println("refId: " + s.getRefId());
				System.out.println("##### BEGIN NAME #####");
				System.out.println("type: " + s.getName().getType());
				System.out.println("prefix: " + s.getName().getPrefix());
				System.out.println("familyName: " + s.getName().getFamilyName());
				System.out.println("givenName: " + s.getName().getGivenName());
				System.out.println("middleName: " + s.getName().getMiddleName());
				System.out.println("suffix: " + s.getName().getSuffix());
				System.out.println("##### END NAME #####");
				System.out.println("##### BEGIN OTHERNAME #####");
				for (XPersonNameType n : s.getOtherNames().getName())
				{
					System.out.println("type: " + n.getType());
					System.out.println("prefix: " + n.getPrefix());
					System.out.println("familyName: " + n.getFamilyName());
					System.out.println("givenName: " + n.getGivenName());
					System.out.println("middleName: " + n.getMiddleName());
					System.out.println("suffix: " + n.getSuffix());
				}
				System.out.println("##### END OTHERNAME #####");

				System.out.println("localId: " + s.getLocalId());
				
				System.out.println("stateProvinceIdloginId: " + s.getStateProvinceId());
				System.out.println("##### BEGIN OTHERIDS #####");
				for (XOtherPersonIdType id : s.getOtherIds().getOtherId())
				{
					System.out.println("id: " + id.getId());
					System.out.println("type: " + id.getType());
				}
				System.out.println("##### END OTHERIDS #####");
				System.out.println("##### BEGIN ADDRESS #####");
				System.out.println("addressType: " + s.getAddress().getAddressType());
				System.out.println("city: " + s.getAddress().getCity());
				System.out.println("line1: " + s.getAddress().getLine1());
				System.out.println("line2: " + s.getAddress().getLine2());
				System.out.println("countryCode: " + s.getAddress().getCountryCode());
				System.out.println("postalCode: " + s.getAddress().getPostalCode());
				System.out.println("stateProvince: " + s.getAddress().getStateProvince());
				System.out.println("number: " + s.getPhoneNumber().getNumber());
				System.out.println("phoneNumberType: " + s.getPhoneNumber().getPhoneNumberType());
				System.out.println("primaryIndicator: " + s.getPhoneNumber().isPrimaryIndicator());
				System.out.println("##### END ADDRESS #####");
				System.out.println("##### BEGIN PHONENUMBERS #####");
				System.out.println("number: " + s.getPhoneNumber().getNumber());
				System.out.println("phoneNumberType: " + s.getPhoneNumber().getPhoneNumberType());
				System.out.println("primaryIndicator: " + s.getPhoneNumber().isPrimaryIndicator());
				System.out.println("##### END PHONENUMBERS #####");
				System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
				for (XTelephoneType p : s.getOtherPhoneNumbers().getPhoneNumber())
				{
					System.out.println("otherPhoneNumbers number: " + p.getNumber());
					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
				}
				System.out.println("##### END OTHERPHONENUMBERS #####");
				System.out.println("##### BEGIN EMAIL #####");
				System.out.println("emailType: " + s.getEmail().getEmailType());
				System.out.println("emailAddress: " + s.getEmail().getEmailAddress());
				System.out.println("##### END EMAIL #####");
				System.out.println("##### BEGIN OTHEREMAILS #####");
				for (XEmailType e : s.getOtherEmails().getEmail())
				{
					System.out.println("emailType: " + e.getEmailType());
					System.out.println("emailAddress: " + e.getEmailAddress());
				}
				System.out.println("##### END OTHEREMAILS #####");
				System.out.println("##### BEGIN DEMOGRAPHICS #####");
				System.out.println("##### BEGIN RACES #####");
				for (XRaceType r : s.getDemographics().getRaces().getRace())
				{
					System.out.println("race: " + r.getRace());
				}
				System.out.println("##### END RACES #####");
				System.out.println("hispanicLatinoEthnicity: " + s.getDemographics().isHispanicLatinoEthnicity());
				System.out.println("sex: " + s.getDemographics().getSex());
				System.out.println("birthDate: " + s.getDemographics().getBirthDate());
				System.out.println("countryOfBirth: " + s.getDemographics().getCountryOfBirth());
				System.out.println("usCitizenshipStatus: " + s.getDemographics().getUsCitizenshipStatus());
				System.out.println("##### END DEMOGRAPHICS #####");
				System.out.println("##### BEGIN ENROLLMENT #####");
				System.out.println("leaRefId: " + s.getEnrollment().getLeaRefId());
				System.out.println("schoolRefId: " + s.getEnrollment().getSchoolRefId());
				System.out.println("studentSchoolAssociationRefId: " + s.getEnrollment().getStudentSchoolAssociationRefId());
				System.out.println("responsibleSchoolType: " + s.getEnrollment().getResponsibleSchoolType());
				System.out.println("membershipType: " + s.getEnrollment().getMembershipType());
				System.out.println("entryDate: " + s.getEnrollment().getEntryDate());
				System.out.println("exitDate: " + s.getEnrollment().getExitDate());
				System.out.println("homeRoomNumber: " + s.getEnrollment().getHomeRoomNumber());
				System.out.println("##### BEGIN HOMEROOMTEACHER #####");
				System.out.println("refId: " + s.getEnrollment().getHomeRoomTeacher().getRefId());
				System.out.println("localId: " + s.getEnrollment().getHomeRoomTeacher().getLocalId());
				System.out.println("givenName: " + s.getEnrollment().getHomeRoomTeacher().getGivenName());
				System.out.println("familyName: " + s.getEnrollment().getHomeRoomTeacher().getFamilyName());
				System.out.println("##### END HOMEROOMTEACHER #####");
				System.out.println("gradeLevel: " + s.getEnrollment().getGradeLevel());
				System.out.println("projectedGraduationYear: " + s.getEnrollment().getProjectedGraduationYear());
				System.out.println("##### BEGIN COUNSELOR #####");
				System.out.println("refId: " + s.getEnrollment().getCounselor().getRefId());
				System.out.println("localId: " + s.getEnrollment().getCounselor().getLocalId());
				System.out.println("givenName: " + s.getEnrollment().getCounselor().getGivenName());
				System.out.println("familyName: " + s.getEnrollment().getCounselor().getFamilyName());
				System.out.println("##### END COUNSELOR #####");
				System.out.println("##### END ENROLLMENT #####");
				System.out.println("##### BEGIN OTHERENROLLMENT #####");
				for (XEnrollmentType e : s.getOtherEnrollments().getEnrollment())
				{
					System.out.println("leaRefId: " + e.getLeaRefId());
					System.out.println("schoolRefId: " + e.getSchoolRefId());
					System.out.println("studentSchoolAssociationRefId: " + e.getStudentSchoolAssociationRefId());
					System.out.println("responsibleSchoolType: " + e.getResponsibleSchoolType());
					System.out.println("membershipType: " + e.getMembershipType());
					System.out.println("entryDate: " + e.getEntryDate());
					System.out.println("exitDate: " + e.getExitDate());
					System.out.println("homeRoomNumber: " + e.getHomeRoomNumber());
					System.out.println("##### BEGIN HOMEROOMTEACHER #####");
					System.out.println("refId: " + e.getHomeRoomTeacher().getRefId());
					System.out.println("localId: " + e.getHomeRoomTeacher().getLocalId());
					System.out.println("givenName: " + e.getHomeRoomTeacher().getGivenName());
					System.out.println("familyName: " + e.getHomeRoomTeacher().getFamilyName());
					System.out.println("##### END HOMEROOMTEACHER #####");
					System.out.println("gradeLevel: " + e.getGradeLevel());
					System.out.println("projectedGraduationYear: " + e.getProjectedGraduationYear());
					System.out.println("##### BEGIN COUNSELOR #####");
					System.out.println("refId: " + e.getCounselor().getRefId());
					System.out.println("localId: " + e.getCounselor().getLocalId());
					System.out.println("givenName: " + e.getCounselor().getGivenName());
					System.out.println("familyName: " + e.getCounselor().getFamilyName());
					System.out.println("##### END COUNSELOR #####");
				}
				System.out.println("##### END OTHERENROLLMENT #####");
				System.out.println("##### BEGIN ACADEMICSUMMARY #####");
				System.out.println("cumulativeWeightedGpa: " + s.getAcademicSummary().getCumulativeWeightedGpa());
				System.out.println("termWeightedGpa: " + s.getAcademicSummary().getTermWeightedGpa());
				System.out.println("classRank: " + s.getAcademicSummary().getClassRank());
				System.out.println("##### END ACADEMICSUMMARY #####");
				System.out.println("##### BEGIN STUDENTCONTACTS #####");
				for (String contactRefid : s.getStudentContacts().getContactPersonRefId())
				{
					System.out.println("contactPersonRefId: " + contactRefid);
				}
				for (XContactType c : s.getStudentContacts().getXContact())
				{
					System.out.println("##### BEGIN NAME #####");
					System.out.println("type: " + c.getName().getType());
					System.out.println("prefix: " + c.getName().getPrefix());
					System.out.println("familyName: " + c.getName().getFamilyName());
					System.out.println("givenName: " + c.getName().getGivenName());
					System.out.println("middleName: " + c.getName().getMiddleName());
					System.out.println("suffix: " + c.getName().getSuffix());
					System.out.println("##### END NAME #####");
					System.out.println("##### BEGIN OTHERNAME #####");
					for (XPersonNameType n : c.getOtherNames().getName())
					{
						System.out.println("type: " + n.getType());
						System.out.println("prefix: " + n.getPrefix());
						System.out.println("familyName: " + n.getFamilyName());
						System.out.println("givenName: " + n.getGivenName());
						System.out.println("middleName: " + n.getMiddleName());
						System.out.println("suffix: " + n.getSuffix());
					}
					System.out.println("##### END OTHERNAME #####");
					System.out.println(": " + c.getLocalId());

					System.out.println("##### BEGIN OTHERIDS #####");
					for (XOtherPersonIdType id : c.getOtherIds().getOtherId())
					{
						System.out.println("id: " + id.getId());
						System.out.println("type: " + id.getType());
					}
					System.out.println("##### END OTHERIDS #####");
					System.out.println("##### BEGIN ADDRESS #####");
					System.out.println("addressType: " + c.getAddress().getAddressType());
					System.out.println("city: " + c.getAddress().getCity());
					System.out.println("line1: " + c.getAddress().getLine1());
					System.out.println("line2: " + c.getAddress().getLine2());
					System.out.println("countryCode: " + c.getAddress().getCountryCode());
					System.out.println("postalCode: " + c.getAddress().getPostalCode());
					System.out.println("stateProvince: " + c.getAddress().getStateProvince());
					System.out.println("number: " + c.getPhoneNumber().getNumber());
					System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
					System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
					System.out.println("##### END ADDRESS #####");
					System.out.println("##### BEGIN PHONENUMBERS #####");
					System.out.println("number: " + c.getPhoneNumber().getNumber());
					System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
					System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
					System.out.println("##### END PHONENUMBERS #####");
					System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
					for (XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber())
					{
						System.out.println("otherPhoneNumbers number: " + p.getNumber());
						System.out.println("phoneNumberType: " + p.getPhoneNumberType());
						System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
					}
					System.out.println("##### END OTHERPHONENUMBERS #####");
					System.out.println("##### BEGIN EMAIL #####");
					System.out.println("emailType: " + c.getEmail().getEmailType());
					System.out.println("emailAddress: " + c.getEmail().getEmailAddress());
					System.out.println("##### END EMAIL #####");
					System.out.println("##### BEGIN OTHEREMAILS #####");
					for (XEmailType e : c.getOtherEmails().getEmail())
					{
						System.out.println("emailType: " + e.getEmailType());
						System.out.println("emailAddress: " + e.getEmailAddress());
					}
					System.out.println("##### END OTHEREMAILS #####");
					System.out.println(": " + c.getSex());
					System.out.println(": " + c.getEmployerType());
					System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
					for (XContactStudentRelationshipType csr : c.getRelationships().getRelationship())
					{
						System.out.println("studentRefId: " + csr.getStudentRefId());
						System.out.println("relationshipCode: " + csr.getRelationshipCode());
						System.out.println("restrictions: " + csr.getRestrictions());
						System.out.println("livesWith: " + csr.isLivesWith());
						System.out.println("primaryContactIndicator: " + csr.isPrimaryContactIndicator());
						System.out.println("emergencyContactIndicator: " + csr.isEmergencyContactIndicator());
						System.out.println("financialResponsibilityIndicator: " + csr.isFinancialResponsibilityIndicator());
						System.out.println("custodialIndicator: " + csr.isCustodialIndicator());
						System.out.println("communicationsIndicator: " + csr.isCommunicationsIndicator());
						System.out.println("contactSequence: " + csr.getContactSequence());
					}
					System.out.println("##### END CONTACTRELATIONSHIPS #####");
				}
				System.out.println("##### END STUDENTCONTACTS #####");
				System.out.println("##### BEGIN LANGUAGES #####");
				for (XLanguageType l : s.getLanguages().getLanguage())
				{
					System.out.println("type: " + l.getType());
					System.out.println("code: " + l.getCode());
				}
				System.out.println("##### END LANGUAGES #####");
				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}

	// RETURN STUDENTS BY CONTACT
	public static void XStudents_GetXStudentsByXContactLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXSTUDENTSBYXCONTACT, refId); i++)
		{
			for (XStudentType s : xPress.getXStudentsByXContact(refId).getData())
			{
				System.out.println("refId: " + s.getRefId());
				System.out.println("##### BEGIN NAME #####");
				System.out.println("type: " + s.getName().getType());
				System.out.println("prefix: " + s.getName().getPrefix());
				System.out.println("familyName: " + s.getName().getFamilyName());
				System.out.println("givenName: " + s.getName().getGivenName());
				System.out.println("middleName: " + s.getName().getMiddleName());
				System.out.println("suffix: " + s.getName().getSuffix());
				System.out.println("##### END NAME #####");
				System.out.println("##### BEGIN OTHERNAME #####");
				for (XPersonNameType n : s.getOtherNames().getName())
				{
					System.out.println("type: " + n.getType());
					System.out.println("prefix: " + n.getPrefix());
					System.out.println("familyName: " + n.getFamilyName());
					System.out.println("givenName: " + n.getGivenName());
					System.out.println("middleName: " + n.getMiddleName());
					System.out.println("suffix: " + n.getSuffix());
				}
				System.out.println("##### END OTHERNAME #####");

				System.out.println("localId: " + s.getLocalId());
				System.out.println("stateProvinceIdloginId: " + s.getStateProvinceId());
				System.out.println("##### BEGIN OTHERIDS #####");
				for (XOtherPersonIdType id : s.getOtherIds().getOtherId())
				{
					System.out.println("id: " + id.getId());
					System.out.println("type: " + id.getType());
				}
				System.out.println("##### END OTHERIDS #####");
				System.out.println("##### BEGIN ADDRESS #####");
				System.out.println("addressType: " + s.getAddress().getAddressType());
				System.out.println("city: " + s.getAddress().getCity());
				System.out.println("line1: " + s.getAddress().getLine1());
				System.out.println("line2: " + s.getAddress().getLine2());
				System.out.println("countryCode: " + s.getAddress().getCountryCode());
				System.out.println("postalCode: " + s.getAddress().getPostalCode());
				System.out.println("stateProvince: " + s.getAddress().getStateProvince());
				System.out.println("number: " + s.getPhoneNumber().getNumber());
				System.out.println("phoneNumberType: " + s.getPhoneNumber().getPhoneNumberType());
				System.out.println("primaryIndicator: " + s.getPhoneNumber().isPrimaryIndicator());
				System.out.println("##### END ADDRESS #####");
				System.out.println("##### BEGIN PHONENUMBERS #####");
				System.out.println("number: " + s.getPhoneNumber().getNumber());
				System.out.println("phoneNumberType: " + s.getPhoneNumber().getPhoneNumberType());
				System.out.println("primaryIndicator: " + s.getPhoneNumber().isPrimaryIndicator());
				System.out.println("##### END PHONENUMBERS #####");
				System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
				for (XTelephoneType p : s.getOtherPhoneNumbers().getPhoneNumber())
				{
					System.out.println("otherPhoneNumbers number: " + p.getNumber());
					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
				}
				System.out.println("##### END OTHERPHONENUMBERS #####");
				System.out.println("##### BEGIN EMAIL #####");
				System.out.println("emailType: " + s.getEmail().getEmailType());
				System.out.println("emailAddress: " + s.getEmail().getEmailAddress());
				System.out.println("##### END EMAIL #####");
				System.out.println("##### BEGIN OTHEREMAILS #####");
				for (XEmailType e : s.getOtherEmails().getEmail())
				{
					System.out.println("emailType: " + e.getEmailType());
					System.out.println("emailAddress: " + e.getEmailAddress());
				}
				System.out.println("##### END OTHEREMAILS #####");
				System.out.println("##### BEGIN DEMOGRAPHICS #####");
				System.out.println("##### BEGIN RACES #####");
				for (XRaceType r : s.getDemographics().getRaces().getRace())
				{
					System.out.println("race: " + r.getRace());
				}
				System.out.println("##### END RACES #####");
				System.out.println("hispanicLatinoEthnicity: " + s.getDemographics().isHispanicLatinoEthnicity());
				System.out.println("sex: " + s.getDemographics().getSex());
				System.out.println("birthDate: " + s.getDemographics().getBirthDate());
				System.out.println("countryOfBirth: " + s.getDemographics().getCountryOfBirth());
				System.out.println("usCitizenshipStatus: " + s.getDemographics().getUsCitizenshipStatus());
				System.out.println("##### END DEMOGRAPHICS #####");
				System.out.println("##### BEGIN ENROLLMENT #####");
				System.out.println("leaRefId: " + s.getEnrollment().getLeaRefId());
				System.out.println("schoolRefId: " + s.getEnrollment().getSchoolRefId());
				System.out.println("studentSchoolAssociationRefId: " + s.getEnrollment().getStudentSchoolAssociationRefId());
				System.out.println("responsibleSchoolType: " + s.getEnrollment().getResponsibleSchoolType());
				System.out.println("membershipType: " + s.getEnrollment().getMembershipType());
				System.out.println("entryDate: " + s.getEnrollment().getEntryDate());
				System.out.println("exitDate: " + s.getEnrollment().getExitDate());
				System.out.println("homeRoomNumber: " + s.getEnrollment().getHomeRoomNumber());
				System.out.println("##### BEGIN HOMEROOMTEACHER #####");
				System.out.println("refId: " + s.getEnrollment().getHomeRoomTeacher().getRefId());
				System.out.println("localId: " + s.getEnrollment().getHomeRoomTeacher().getLocalId());
				System.out.println("givenName: " + s.getEnrollment().getHomeRoomTeacher().getGivenName());
				System.out.println("familyName: " + s.getEnrollment().getHomeRoomTeacher().getFamilyName());
				System.out.println("##### END HOMEROOMTEACHER #####");
				System.out.println("gradeLevel: " + s.getEnrollment().getGradeLevel());
				System.out.println("projectedGraduationYear: " + s.getEnrollment().getProjectedGraduationYear());
				System.out.println("##### BEGIN COUNSELOR #####");
				System.out.println("refId: " + s.getEnrollment().getCounselor().getRefId());
				System.out.println("localId: " + s.getEnrollment().getCounselor().getLocalId());
				System.out.println("givenName: " + s.getEnrollment().getCounselor().getGivenName());
				System.out.println("familyName: " + s.getEnrollment().getCounselor().getFamilyName());
				System.out.println("##### END COUNSELOR #####");
				System.out.println("##### END ENROLLMENT #####");
				System.out.println("##### BEGIN OTHERENROLLMENT #####");
				for (XEnrollmentType e : s.getOtherEnrollments().getEnrollment())
				{
					System.out.println("leaRefId: " + e.getLeaRefId());
					System.out.println("schoolRefId: " + e.getSchoolRefId());
					System.out.println("studentSchoolAssociationRefId: " + e.getStudentSchoolAssociationRefId());
					System.out.println("responsibleSchoolType: " + e.getResponsibleSchoolType());
					System.out.println("membershipType: " + e.getMembershipType());
					System.out.println("entryDate: " + e.getEntryDate());
					System.out.println("exitDate: " + e.getExitDate());
					System.out.println("homeRoomNumber: " + e.getHomeRoomNumber());
					System.out.println("##### BEGIN HOMEROOMTEACHER #####");
					System.out.println("refId: " + e.getHomeRoomTeacher().getRefId());
					System.out.println("localId: " + e.getHomeRoomTeacher().getLocalId());
					System.out.println("givenName: " + e.getHomeRoomTeacher().getGivenName());
					System.out.println("familyName: " + e.getHomeRoomTeacher().getFamilyName());
					System.out.println("##### END HOMEROOMTEACHER #####");
					System.out.println("gradeLevel: " + e.getGradeLevel());
					System.out.println("projectedGraduationYear: " + e.getProjectedGraduationYear());
					System.out.println("##### BEGIN COUNSELOR #####");
					System.out.println("refId: " + e.getCounselor().getRefId());
					System.out.println("localId: " + e.getCounselor().getLocalId());
					System.out.println("givenName: " + e.getCounselor().getGivenName());
					System.out.println("familyName: " + e.getCounselor().getFamilyName());
					System.out.println("##### END COUNSELOR #####");
				}
				System.out.println("##### END OTHERENROLLMENT #####");
				System.out.println("##### BEGIN ACADEMICSUMMARY #####");
				System.out.println("cumulativeWeightedGpa: " + s.getAcademicSummary().getCumulativeWeightedGpa());
				System.out.println("termWeightedGpa: " + s.getAcademicSummary().getTermWeightedGpa());
				System.out.println("classRank: " + s.getAcademicSummary().getClassRank());
				System.out.println("##### END ACADEMICSUMMARY #####");
				System.out.println("##### BEGIN STUDENTCONTACTS #####");
				for (String contactRefid : s.getStudentContacts().getContactPersonRefId())
				{
					System.out.println("contactPersonRefId: " + contactRefid);
				}
				for (XContactType c : s.getStudentContacts().getXContact())
				{
					System.out.println("##### BEGIN NAME #####");
					System.out.println("type: " + c.getName().getType());
					System.out.println("prefix: " + c.getName().getPrefix());
					System.out.println("familyName: " + c.getName().getFamilyName());
					System.out.println("givenName: " + c.getName().getGivenName());
					System.out.println("middleName: " + c.getName().getMiddleName());
					System.out.println("suffix: " + c.getName().getSuffix());
					System.out.println("##### END NAME #####");
					System.out.println("##### BEGIN OTHERNAME #####");
					for (XPersonNameType n : c.getOtherNames().getName())
					{
						System.out.println("type: " + n.getType());
						System.out.println("prefix: " + n.getPrefix());
						System.out.println("familyName: " + n.getFamilyName());
						System.out.println("givenName: " + n.getGivenName());
						System.out.println("middleName: " + n.getMiddleName());
						System.out.println("suffix: " + n.getSuffix());
					}
					System.out.println("##### END OTHERNAME #####");
					System.out.println(": " + c.getLocalId());

					System.out.println("##### BEGIN OTHERIDS #####");
					for (XOtherPersonIdType id : c.getOtherIds().getOtherId())
					{
						System.out.println("id: " + id.getId());
						System.out.println("type: " + id.getType());
					}
					System.out.println("##### END OTHERIDS #####");
					System.out.println("##### BEGIN ADDRESS #####");
					System.out.println("addressType: " + c.getAddress().getAddressType());
					System.out.println("city: " + c.getAddress().getCity());
					System.out.println("line1: " + c.getAddress().getLine1());
					System.out.println("line2: " + c.getAddress().getLine2());
					System.out.println("countryCode: " + c.getAddress().getCountryCode());
					System.out.println("postalCode: " + c.getAddress().getPostalCode());
					System.out.println("stateProvince: " + c.getAddress().getStateProvince());
					System.out.println("number: " + c.getPhoneNumber().getNumber());
					System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
					System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
					System.out.println("##### END ADDRESS #####");
					System.out.println("##### BEGIN PHONENUMBERS #####");
					System.out.println("number: " + c.getPhoneNumber().getNumber());
					System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
					System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
					System.out.println("##### END PHONENUMBERS #####");
					System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
					for (XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber())
					{
						System.out.println("otherPhoneNumbers number: " + p.getNumber());
						System.out.println("phoneNumberType: " + p.getPhoneNumberType());
						System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
					}
					System.out.println("##### END OTHERPHONENUMBERS #####");
					System.out.println("##### BEGIN EMAIL #####");
					System.out.println("emailType: " + c.getEmail().getEmailType());
					System.out.println("emailAddress: " + c.getEmail().getEmailAddress());
					System.out.println("##### END EMAIL #####");
					System.out.println("##### BEGIN OTHEREMAILS #####");
					for (XEmailType e : c.getOtherEmails().getEmail())
					{
						System.out.println("emailType: " + e.getEmailType());
						System.out.println("emailAddress: " + e.getEmailAddress());
					}
					System.out.println("##### END OTHEREMAILS #####");
					System.out.println(": " + c.getSex());
					System.out.println(": " + c.getEmployerType());
					System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
					for (XContactStudentRelationshipType csr : c.getRelationships().getRelationship())
					{
						System.out.println("studentRefId: " + csr.getStudentRefId());
						System.out.println("relationshipCode: " + csr.getRelationshipCode());
						System.out.println("restrictions: " + csr.getRestrictions());
						System.out.println("livesWith: " + csr.isLivesWith());
						System.out.println("primaryContactIndicator: " + csr.isPrimaryContactIndicator());
						System.out.println("emergencyContactIndicator: " + csr.isEmergencyContactIndicator());
						System.out.println("financialResponsibilityIndicator: " + csr.isFinancialResponsibilityIndicator());
						System.out.println("custodialIndicator: " + csr.isCustodialIndicator());
						System.out.println("communicationsIndicator: " + csr.isCommunicationsIndicator());
						System.out.println("contactSequence: " + csr.getContactSequence());
					}
					System.out.println("##### END CONTACTRELATIONSHIPS #####");
				}
				System.out.println("##### END STUDENTCONTACTS #####");
				System.out.println("##### BEGIN LANGUAGES #####");
				for (XLanguageType l : s.getLanguages().getLanguage())
				{
					System.out.println("type: " + l.getType());
					System.out.println("code: " + l.getCode());
				}
				System.out.println("##### END LANGUAGES #####");
				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}

 	// #################### xContacts ####################
	// RETURN ALL CONTACTS
	public static void XContacts_GetXSContactsLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXCONTACTS); i++)
		{
			for (XContactType c : xPress.getXContacts().getData())
			{
				System.out.println("refId: " + c.getRefId());
				System.out.println("##### BEGIN NAME #####");
				System.out.println("type: " + c.getName().getType());
				System.out.println("prefix: " + c.getName().getPrefix());
				System.out.println("familyName: " + c.getName().getFamilyName());
				System.out.println("givenName: " + c.getName().getGivenName());
				System.out.println("middleName: " + c.getName().getMiddleName());
				System.out.println("suffix: " + c.getName().getSuffix());
				System.out.println("##### END NAME #####");
				System.out.println("##### BEGIN OTHERNAME #####");
				for (XPersonNameType n : c.getOtherNames().getName())
				{
					System.out.println("type: " + n.getType());
					System.out.println("prefix: " + n.getPrefix());
					System.out.println("familyName: " + n.getFamilyName());
					System.out.println("givenName: " + n.getGivenName());
					System.out.println("middleName: " + n.getMiddleName());
					System.out.println("suffix: " + n.getSuffix());
				}
				System.out.println("##### END OTHERNAME #####");

				System.out.println("localId: " + c.getLocalId());
				
				System.out.println("##### BEGIN OTHERIDS #####");
				for (XOtherPersonIdType id : c.getOtherIds().getOtherId())
				{
					System.out.println("id: " + id.getId());
					System.out.println("type: " + id.getType());
				}
				System.out.println("##### END OTHERIDS #####");
				System.out.println("##### BEGIN ADDRESS #####");
				System.out.println("addressType: " + c.getAddress().getAddressType());
				System.out.println("city: " + c.getAddress().getCity());
				System.out.println("line1: " + c.getAddress().getLine1());
				System.out.println("line2: " + c.getAddress().getLine2());
				System.out.println("countryCode: " + c.getAddress().getCountryCode());
				System.out.println("postalCode: " + c.getAddress().getPostalCode());
				System.out.println("stateProvince: " + c.getAddress().getStateProvince());
				System.out.println("number: " + c.getPhoneNumber().getNumber());
				System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
				System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
				System.out.println("##### END ADDRESS #####");
				System.out.println("##### BEGIN PHONENUMBERS #####");
				System.out.println("number: " + c.getPhoneNumber().getNumber());
				System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
				System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
				System.out.println("##### END PHONENUMBERS #####");
				System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
				for (XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber())
				{
					System.out.println("otherPhoneNumbers number: " + p.getNumber());
					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
				}
				System.out.println("##### END OTHERPHONENUMBERS #####");
				System.out.println("##### BEGIN EMAIL #####");
				System.out.println("emailType: " + c.getEmail().getEmailType());
				System.out.println("emailAddress: " + c.getEmail().getEmailAddress());
				System.out.println("##### END EMAIL #####");
				System.out.println("##### BEGIN OTHEREMAILS #####");
				for (XEmailType e : c.getOtherEmails().getEmail())
				{
					System.out.println("emailType: " + e.getEmailType());
					System.out.println("emailAddress: " + e.getEmailAddress());
				}
				System.out.println("##### END OTHEREMAILS #####");
				System.out.println("sex: " + c.getSex());
				System.out.println("employerType: " + c.getEmployerType());
				System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
				for (XContactStudentRelationshipType csr : c.getRelationships().getRelationship())
				{
					System.out.println("studentRefId: " + csr.getStudentRefId());
					System.out.println("relationshipCode: " + csr.getRelationshipCode());
					System.out.println("restrictions: " + csr.getRestrictions());
					System.out.println("livesWith: " + csr.isLivesWith());
					System.out.println("primaryContactIndicator: " + csr.isPrimaryContactIndicator());
					System.out.println("emergencyContactIndicator: " + csr.isEmergencyContactIndicator());
					System.out.println("financialResponsibilityIndicator: " + csr.isFinancialResponsibilityIndicator());
					System.out.println("custodialIndicator: " + csr.isCustodialIndicator());
					System.out.println("communicationsIndicator: " + csr.isCommunicationsIndicator());
					System.out.println("contactSequence: " + csr.getContactSequence());
				}
				System.out.println("##### END CONTACTRELATIONSHIPS #####");
				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}

	// RETURN CONTACTS BY LEA
	public static void XContacts_GetXContactsByXLeaLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXCONTACTSBYXLEA, refId); i++)
		{
			for (XContactType c : xPress.getXContactsByXLea(refId).getData())
			{
				System.out.println("refId: " + c.getRefId());
				System.out.println("##### BEGIN NAME #####");
				System.out.println("type: " + c.getName().getType());
				System.out.println("prefix: " + c.getName().getPrefix());
				System.out.println("familyName: " + c.getName().getFamilyName());
				System.out.println("givenName: " + c.getName().getGivenName());
				System.out.println("middleName: " + c.getName().getMiddleName());
				System.out.println("suffix: " + c.getName().getSuffix());
				System.out.println("##### END NAME #####");
				System.out.println("##### BEGIN OTHERNAME #####");
				for (XPersonNameType n : c.getOtherNames().getName())
				{
					System.out.println("type: " + n.getType());
					System.out.println("prefix: " + n.getPrefix());
					System.out.println("familyName: " + n.getFamilyName());
					System.out.println("givenName: " + n.getGivenName());
					System.out.println("middleName: " + n.getMiddleName());
					System.out.println("suffix: " + n.getSuffix());
				}
				System.out.println("##### END OTHERNAME #####");

				System.out.println("localId: " + c.getLocalId());
				System.out.println("##### BEGIN OTHERIDS #####");
				for (XOtherPersonIdType id : c.getOtherIds().getOtherId())
				{
					System.out.println("id: " + id.getId());
					System.out.println("type: " + id.getType());
				}
				System.out.println("##### END OTHERIDS #####");
				System.out.println("##### BEGIN ADDRESS #####");
				System.out.println("addressType: " + c.getAddress().getAddressType());
				System.out.println("city: " + c.getAddress().getCity());
				System.out.println("line1: " + c.getAddress().getLine1());
				System.out.println("line2: " + c.getAddress().getLine2());
				System.out.println("countryCode: " + c.getAddress().getCountryCode());
				System.out.println("postalCode: " + c.getAddress().getPostalCode());
				System.out.println("stateProvince: " + c.getAddress().getStateProvince());
				System.out.println("number: " + c.getPhoneNumber().getNumber());
				System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
				System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
				System.out.println("##### END ADDRESS #####");
				System.out.println("##### BEGIN PHONENUMBERS #####");
				System.out.println("number: " + c.getPhoneNumber().getNumber());
				System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
				System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
				System.out.println("##### END PHONENUMBERS #####");
				System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
				for (XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber())
				{
					System.out.println("otherPhoneNumbers number: " + p.getNumber());
					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
				}
				System.out.println("##### END OTHERPHONENUMBERS #####");
				System.out.println("##### BEGIN EMAIL #####");
				System.out.println("emailType: " + c.getEmail().getEmailType());
				System.out.println("emailAddress: " + c.getEmail().getEmailAddress());
				System.out.println("##### END EMAIL #####");
				System.out.println("##### BEGIN OTHEREMAILS #####");
				for (XEmailType e : c.getOtherEmails().getEmail())
				{
					System.out.println("emailType: " + e.getEmailType());
					System.out.println("emailAddress: " + e.getEmailAddress());
				}
				System.out.println("##### END OTHEREMAILS #####");
				System.out.println("sex: " + c.getSex());
				System.out.println("employerType: " + c.getEmployerType());
				System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
				for (XContactStudentRelationshipType csr : c.getRelationships().getRelationship())
				{
					System.out.println("studentRefId: " + csr.getStudentRefId());
					System.out.println("relationshipCode: " + csr.getRelationshipCode());
					System.out.println("restrictions: " + csr.getRestrictions());
					System.out.println("livesWith: " + csr.isLivesWith());
					System.out.println("primaryContactIndicator: " + csr.isPrimaryContactIndicator());
					System.out.println("emergencyContactIndicator: " + csr.isEmergencyContactIndicator());
					System.out.println("financialResponsibilityIndicator: " + csr.isFinancialResponsibilityIndicator());
					System.out.println("custodialIndicator: " + csr.isCustodialIndicator());
					System.out.println("communicationsIndicator: " + csr.isCommunicationsIndicator());
					System.out.println("contactSequence: " + csr.getContactSequence());
				}
				System.out.println("##### END CONTACTRELATIONSHIPS #####");
				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}

	// RETURN CONTACTS BY SCHOOL
	public static void XContacts_GetXContactsByXSchoolLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXCONTACTSBYXSCHOOL, refId); i++)
		{
			for (XContactType c : xPress.getXContactsByXSchool(refId).getData())
			{
				System.out.println("refId: " + c.getRefId());
				System.out.println("##### BEGIN NAME #####");
				System.out.println("type: " + c.getName().getType());
				System.out.println("prefix: " + c.getName().getPrefix());
				System.out.println("familyName: " + c.getName().getFamilyName());
				System.out.println("givenName: " + c.getName().getGivenName());
				System.out.println("middleName: " + c.getName().getMiddleName());
				System.out.println("suffix: " + c.getName().getSuffix());
				System.out.println("##### END NAME #####");
				System.out.println("##### BEGIN OTHERNAME #####");
				for (XPersonNameType n : c.getOtherNames().getName())
				{
					System.out.println("type: " + n.getType());
					System.out.println("prefix: " + n.getPrefix());
					System.out.println("familyName: " + n.getFamilyName());
					System.out.println("givenName: " + n.getGivenName());
					System.out.println("middleName: " + n.getMiddleName());
					System.out.println("suffix: " + n.getSuffix());
				}
				System.out.println("##### END OTHERNAME #####");

				System.out.println("localId: " + c.getLocalId());
				System.out.println("##### BEGIN OTHERIDS #####");
				for (XOtherPersonIdType id : c.getOtherIds().getOtherId())
				{
					System.out.println("id: " + id.getId());
					System.out.println("type: " + id.getType());
				}
				System.out.println("##### END OTHERIDS #####");
				System.out.println("##### BEGIN ADDRESS #####");
				System.out.println("addressType: " + c.getAddress().getAddressType());
				System.out.println("city: " + c.getAddress().getCity());
				System.out.println("line1: " + c.getAddress().getLine1());
				System.out.println("line2: " + c.getAddress().getLine2());
				System.out.println("countryCode: " + c.getAddress().getCountryCode());
				System.out.println("postalCode: " + c.getAddress().getPostalCode());
				System.out.println("stateProvince: " + c.getAddress().getStateProvince());
				System.out.println("number: " + c.getPhoneNumber().getNumber());
				System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
				System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
				System.out.println("##### END ADDRESS #####");
				System.out.println("##### BEGIN PHONENUMBERS #####");
				System.out.println("number: " + c.getPhoneNumber().getNumber());
				System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
				System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
				System.out.println("##### END PHONENUMBERS #####");
				System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
				for (XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber())
				{
					System.out.println("otherPhoneNumbers number: " + p.getNumber());
					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
				}
				System.out.println("##### END OTHERPHONENUMBERS #####");
				System.out.println("##### BEGIN EMAIL #####");
				System.out.println("emailType: " + c.getEmail().getEmailType());
				System.out.println("emailAddress: " + c.getEmail().getEmailAddress());
				System.out.println("##### END EMAIL #####");
				System.out.println("##### BEGIN OTHEREMAILS #####");
				for (XEmailType e : c.getOtherEmails().getEmail())
				{
					System.out.println("emailType: " + e.getEmailType());
					System.out.println("emailAddress: " + e.getEmailAddress());
				}
				System.out.println("##### END OTHEREMAILS #####");
				System.out.println("sex: " + c.getSex());
				System.out.println("employerType: " + c.getEmployerType());
				System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
				for (XContactStudentRelationshipType csr : c.getRelationships().getRelationship())
				{
					System.out.println("studentRefId: " + csr.getStudentRefId());
					System.out.println("relationshipCode: " + csr.getRelationshipCode());
					System.out.println("restrictions: " + csr.getRestrictions());
					System.out.println("livesWith: " + csr.isLivesWith());
					System.out.println("primaryContactIndicator: " + csr.isPrimaryContactIndicator());
					System.out.println("emergencyContactIndicator: " + csr.isEmergencyContactIndicator());
					System.out.println("financialResponsibilityIndicator: " + csr.isFinancialResponsibilityIndicator());
					System.out.println("custodialIndicator: " + csr.isCustodialIndicator());
					System.out.println("communicationsIndicator: " + csr.isCommunicationsIndicator());
					System.out.println("contactSequence: " + csr.getContactSequence());
				}
				System.out.println("##### END CONTACTRELATIONSHIPS #####");
				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}

	// RETURN CONTACTS BY STUDENT
	public static void XContacts_GetXContactsByXStudentLastPage(XPress xPress)
	{
		for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXCONTACTSBYXSTUDENT, refId); i++)
		{
			for (XContactType c : xPress.getXContactsByXStudent(refId).getData())
			{
				System.out.println("refId: " + c.getRefId());
				System.out.println("##### BEGIN NAME #####");
				System.out.println("type: " + c.getName().getType());
				System.out.println("prefix: " + c.getName().getPrefix());
				System.out.println("familyName: " + c.getName().getFamilyName());
				System.out.println("givenName: " + c.getName().getGivenName());
				System.out.println("middleName: " + c.getName().getMiddleName());
				System.out.println("suffix: " + c.getName().getSuffix());
				System.out.println("##### END NAME #####");
				System.out.println("##### BEGIN OTHERNAME #####");
				for (XPersonNameType n : c.getOtherNames().getName())
				{
					System.out.println("type: " + n.getType());
					System.out.println("prefix: " + n.getPrefix());
					System.out.println("familyName: " + n.getFamilyName());
					System.out.println("givenName: " + n.getGivenName());
					System.out.println("middleName: " + n.getMiddleName());
					System.out.println("suffix: " + n.getSuffix());
				}
				System.out.println("##### END OTHERNAME #####");

				System.out.println("localId: " + c.getLocalId());
				System.out.println("##### BEGIN OTHERIDS #####");
				for (XOtherPersonIdType id : c.getOtherIds().getOtherId())
				{
					System.out.println("id: " + id.getId());
					System.out.println("type: " + id.getType());
				}
				System.out.println("##### END OTHERIDS #####");
				System.out.println("##### BEGIN ADDRESS #####");
				System.out.println("addressType: " + c.getAddress().getAddressType());
				System.out.println("city: " + c.getAddress().getCity());
				System.out.println("line1: " + c.getAddress().getLine1());
				System.out.println("line2: " + c.getAddress().getLine2());
				System.out.println("countryCode: " + c.getAddress().getCountryCode());
				System.out.println("postalCode: " + c.getAddress().getPostalCode());
				System.out.println("stateProvince: " + c.getAddress().getStateProvince());
				System.out.println("number: " + c.getPhoneNumber().getNumber());
				System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
				System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
				System.out.println("##### END ADDRESS #####");
				System.out.println("##### BEGIN PHONENUMBERS #####");
				System.out.println("number: " + c.getPhoneNumber().getNumber());
				System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
				System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
				System.out.println("##### END PHONENUMBERS #####");
				System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
				for (XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber())
				{
					System.out.println("otherPhoneNumbers number: " + p.getNumber());
					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
				}
				System.out.println("##### END OTHERPHONENUMBERS #####");
				System.out.println("##### BEGIN EMAIL #####");
				System.out.println("emailType: " + c.getEmail().getEmailType());
				System.out.println("emailAddress: " + c.getEmail().getEmailAddress());
				System.out.println("##### END EMAIL #####");
				System.out.println("##### BEGIN OTHEREMAILS #####");
				for (XEmailType e : c.getOtherEmails().getEmail())
				{
					System.out.println("emailType: " + e.getEmailType());
					System.out.println("emailAddress: " + e.getEmailAddress());
				}
				System.out.println("##### END OTHEREMAILS #####");
				System.out.println("sex: " + c.getSex());
				System.out.println("employerType: " + c.getEmployerType());
				System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
				for (XContactStudentRelationshipType csr : c.getRelationships().getRelationship())
				{
					System.out.println("studentRefId: " + csr.getStudentRefId());
					System.out.println("relationshipCode: " + csr.getRelationshipCode());
					System.out.println("restrictions: " + csr.getRestrictions());
					System.out.println("livesWith: " + csr.isLivesWith());
					System.out.println("primaryContactIndicator: " + csr.isPrimaryContactIndicator());
					System.out.println("emergencyContactIndicator: " + csr.isEmergencyContactIndicator());
					System.out.println("financialResponsibilityIndicator: " + csr.isFinancialResponsibilityIndicator());
					System.out.println("custodialIndicator: " + csr.isCustodialIndicator());
					System.out.println("communicationsIndicator: " + csr.isCommunicationsIndicator());
					System.out.println("contactSequence: " + csr.getContactSequence());
				}
				System.out.println("##### END CONTACTRELATIONSHIPS #####");
				System.out.println("========================================");
			}
			System.out.println("######## PAGE " + i + " ########");
		}
	}
}
