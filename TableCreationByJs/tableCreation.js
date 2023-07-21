var theadData = {
    "1" : ["Name","text-danger"],
    "2" : ["Category", "text-danger"],
    "3" : ["Years", "text-danger"]
};
const tbodyData = {
    "1": ['Simon Ugorji', 'Web Developer', '2'],
    "2": ['John Doe', 'App Developer', '3'],
    "3": ['Cherish Junior', 'Full Stack Developer', '4']
};
const tableClass = "table";

function generateTable() {
    var t;
    var table = document.createElement("table");
    table.setAttribute("class", tableClass);
    var thead = document.createElement("thead");
    var theadTr = document.createElement("tr");


    for(t = 1; t <= Object.keys(theadData).length; t++){

        var td = document.createElement("td");
        td.innerText = theadData[t][0];
        //set class
        td.setAttribute("class", theadData[t][1]);

        theadTr.appendChild(td);
    }

    thead.appendChild(theadTr);

    var tbody = document.createElement("tbody");

    var tbodyTd =  {};

    var td;

    for(t = 1; t <= Object.keys(tbodyData).length; t++){

        var tbodyTr = document.createElement("tr");

        for(var a = 0; a < Object.keys(tbodyData[t]).length; ++a){

            tbodyTd[a]  = document.createElement("td");

            tbodyTd[a].innerText = tbodyData[t][a];

            tbodyTr.appendChild(tbodyTd[a]);
        }

        tbody.appendChild(tbodyTr);
    }

    table.appendChild(thead);

    table.appendChild(tbody);
    console.log(document.getElementById('table'))
    document.getElementById('table').appendChild(table);
}