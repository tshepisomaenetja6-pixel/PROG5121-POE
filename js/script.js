/* Prime Property Services
   Enquiry and contact form functionality
*/

// Service enquiry form
const enquiryForm = document.getElementById("enquiryForm");

if (enquiryForm) {
    enquiryForm.addEventListener("submit", function(event) {
        event.preventDefault();

        const name = document.getElementById("fullName").value.trim();
        const service = document.getElementById("service").value;
        const response = document.getElementById("enquiryResponse");

        if (!enquiryForm.checkValidity()) {
            enquiryForm.reportValidity();
            return;
        }

        let serviceMessage = "";

        if (service === "cleaning") {
            serviceMessage = "We can assist with cleaning services.";
        } else if (service === "gardening") {
            serviceMessage = "We can assist with gardening services.";
        } else if (service === "pest-control") {
            serviceMessage = "We can assist with pest control enquiries.";
        }

        response.textContent =
            "Thank you, " + name + "! " +
            serviceMessage +
            " Our team will need to confirm pricing and availability.";

        enquiryForm.reset();
    });
}

// General contact form
const contactForm = document.getElementById("contactForm");

if (contactForm) {
    contactForm.addEventListener("submit", function(event) {
        event.preventDefault();

        if (!contactForm.checkValidity()) {
            contactForm.reportValidity();
            return;
        }

        const name = document.getElementById("contactName").value.trim();
        const email = document.getElementById("contactEmail").value.trim();
        const type = document.getElementById("messageType").value;
        const message = document.getElementById("contactMessage").value.trim();

        const recipient = "REPLACE_WITH_BUSINESS_EMAIL";
        const subject = encodeURIComponent("Website message: " + type);
        const body = encodeURIComponent(
            "Name: " + name + "\n" +
            "Email: " + email + "\n\n" +
            "Message:\n" + message
        );

        if (recipient === "REPLACE_WITH_BUSINESS_EMAIL") {
            document.getElementById("contactResponse").textContent =
                "Please configure the business email address first.";
            return;
        }

        window.location.href =
            "mailto:" + recipient +
            "?subject=" + subject +
            "&body=" + body;
    });
}