/**
* jQuery MiniUI v3.0
* 
* Web Site : http://www.miniui.com
*
* Commercial License : http://www.miniui.com/license
*
* Copyright(c) 2012 All Rights Reserved. Shanghai PusSoft Co., Ltd (上海普加软件有限公司) [ services@plusoft.com.cn ]. 
* 
*/


mini.locale = "en-US";


/* Date
-----------------------------------------------------------------------------*/

mini.dateInfo = {
    monthsLong: ["January", "Febraury", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"],
    monthsShort: ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"],
    daysLong: ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"],
    daysShort: ["Su", "Mo", "Tu", "We", "Th", "Fr", "Sa"],
    quarterLong: ['Q1', 'Q2', 'Q3', 'Q4'],
    quarterShort: ['Q1', 'Q2', 'Q3', 'Q4'],
    halfYearLong: ['first half', 'second half'],
    patterns: {
        "d": "M/d/yyyy",
        "D": "dddd, MMMM dd, yyyy",
        "f": "dddd, MMMM dd, yyyy H:mm tt",
        "F": "dddd, MMMM dd, yyyy H:mm:ss tt",
        "g": "M/d/yyyy H:mm tt",
        "G": "M/d/yyyy H:mm:ss tt",
        "m": "MMMM dd",
        "o": "yyyy-MM-ddTHH:mm:ss.fff",
        "s": "yyyy-MM-ddTHH:mm:ss",
        "t": "H:mm tt",
        "T": "H:mm:ss tt",
        "U": "dddd, MMMM dd, yyyy HH:mm:ss tt",
        "y": "MMM, yyyy"
    },
    tt: {
        "AM": "AM",
        "PM": "PM"
    },
    ten: {
        "Early": "Early",
        "Mid": "Mid",
        "Late": "Late"
    },
    today: 'Today',
    clockType: 24
};

/* Number
-----------------------------------------------------------------------------*/
mini.cultures["en"] = {
    name: "en",
    numberFormat: {
        number: {
            pattern: ["n", "-n"],
            decimals: 2,
            decimalsSeparator: ".",
            groupSeparator: ",",
            groupSize: [3]
        },
        percent: {
            pattern: ["n %", "-n %"],
            decimals: 2,
            decimalsSeparator: ".",
            groupSeparator: ",",
            groupSize: [3],
            symbol: "%"
        },
        currency: {
            pattern: ["$n", "($n)"],
            decimals: 2,
            decimalsSeparator: ".",
            groupSeparator: ",",
            groupSize: [3],
            symbol: "$"
        }
    }
}
mini.culture("en");

/* MessageBox
-----------------------------------------------------------------------------*/
if (mini.MessageBox) {
    mini.copyTo(mini.MessageBox, {
        alertTitle: "Alert",
        confirmTitle: "Confirm",
        prompTitle: "Prompt",
        prompMessage: "Input content: ",
        buttonText: {
            ok: "Ok", //"OK",
            cancel: "Cancel", //"Cancel",
            yes: "Yes", //"Yes",
            no: "No"//"No"
        }
    });
};

/* Calendar
-----------------------------------------------------------------------------*/

if (mini.Calendar) {
    mini.copyTo(mini.Calendar.prototype, {
        firstDayOfWeek: 0,
        yesterdayText: "Yesterday",
        todayText: "Today",
        clearText: "Clear",
        okText: "OK",
        cancelText: "Cancel",
        daysShort: ["Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"],
        format: "MMM, yyyy",

        timeFormat: 'H:mm'
    });
}


/* required | loadingMsg
-----------------------------------------------------------------------------*/
for (var id in mini) {
    var clazz = mini[id];
    if (clazz && clazz.prototype && clazz.prototype.isControl) {
        clazz.prototype.requiredErrorText = "Not null";
        clazz.prototype.loadingMsg = "Loading...";
    }

}

/* VTypes
-----------------------------------------------------------------------------*/
mini.copyTo(mini.VTypes, {
    minDateErrorText: 'Date can not be less than {0}',
    maxDateErrorText: 'Date can not be greater than {0}',

    uniqueErrorText: "This field is unique.",
    requiredErrorText: "This field is required.",
    emailErrorText: "Please enter a valid email address.",
    urlErrorText: "Please enter a valid URL.",
    floatErrorText: "Please enter a valid number.",
    intErrorText: "Please enter only digits",
    dateErrorText: "Please enter a valid date. Date format is {0}",
    maxLengthErrorText: "Please enter no more than {0} characters.",
    minLengthErrorText: "Please enter at least {0} characters.",
    maxErrorText: "Please enter a value less than or equal to {0}.",
    minErrorText: "Please enter a value greater than or equal to {0}.",
    rangeLengthErrorText: "Please enter a value between {0} and {1} characters long.",
    rangeCharErrorText: "Please enter a value between {0} and {1} characters long.",
    rangeErrorText: "Please enter a value between {0} and {1}."
});


if (mini.FileUpload) {
    mini.FileUpload.prototype.buttonText = "Browse..."
}
if (mini.HtmlFile) {
    mini.HtmlFile.prototype.buttonText = "Browse..."
}

/* Pager
-----------------------------------------------------------------------------*/

if (mini.Pager) {
    mini.copyTo(mini.Pager.prototype, {
        firstText: "First",
        prevText: "Prev",
        nextText: "Next",
        lastText: "Last",
        pageInfoText: "Pre page {0} records , all {1} records."
    });
}

/* DataGrid
-----------------------------------------------------------------------------*/
if (mini.DataGrid) {
    mini.copyTo(mini.DataGrid.prototype, {
        emptyText: "No data returned."
    });
}
