/*
                                NOTICE
                                   
     This software (or technical data) was produced for the U. S.
  Government under contract 2006*1014026*000, and is subject to the 
  Rights in Data-General Clause 52.227-14 - Alternate IV (June 1987)
                                   
         (c) 2007 The MITRE Corporation. All Rights Reserved.
*/

// JavaScript Document, Titlebar and Menu

// ALL LINKS MUST BE ABSOLUTE!

function write_link(iLink, classS, textS) {
  var hrefS = iLink[0];
  var titleS = iLink[1];
  var targetS = "";
  if (iLink.length > 2) {
    targetS = ' target="' + iLink[2] + '"';
  }
  var sArray = hrefS.split('/');
  var wArray = self.location.pathname.split('/');
  var classString = 'class=\''+classS+'\'';
  if ( sArray[sArray.length - 1] == wArray[wArray.length - 1] ) {
    // This is the link. Assume names are unique.
    classString = 'class=\''+classS+' curpage\'';
  }
  document.write('<a href=\''+hrefS+'\' '+classString+' title=\''+titleS+'\'' + targetS + '>'+textS+'</a>');
}    

// Writing the tree.

function recursively_write_tree(dTree, dLevel) {
  if (dTree != null) {
    document.write('<ul>');
    for (var i = 0; i < dTree.length; i++) {
      var iName = dTree[i][0];
      var iLink = dTree[i][1];
      var iSubtree = dTree[i][2];
      document.write('<li>');
      if (iLink != null) {
        write_link(iLink, 'nav' + dLevel, iName);
      } else {
        document.write(iName);
      }
      recursively_write_tree(iSubtree, dLevel + 1);
      document.write('</li>\n');
    }
    document.write('</ul>');
  }
}

// Toplevel.

function write_doc_frame(dTitle, dTabs, dTree) {
  document.write('<div id="wrapper-head">');

  // Doc header with menu links

  var PROGRAM_NAME='Oxygen'
  var CLASSIFICATION='(U)'
  
  document.write('<div id="header">');
  document.write('<img src="./img/globe.png" alt="ICON HERE" />'
    + '<div class="titleheader"> '+CLASSIFICATION + ' '+ dTitle + '</div>\n');
  document.write('<table><tr class="titleheader>');
  for (var i = 0; i < dTabs.length; i++) {
    var dTab = dTabs[i][0];
    var dLink = dTabs[i][1];
    if (i > 0 && i < (dTabs.length - 1)) {
      // It's a medial tab
      document.write('<td class="medial">');
    } else {
      document.write('<td class="titleheader">');
    }
    if (dLink == null) {
      document.write(dTab);
    } else {
      document.write('<a href="' + dLink + '" class="style1">' + dTab + '</a>');
    }
    if (dTabs[i].length > 2) {
      var subTabs = dTabs[i][2];
      document.write('<br><span style="font-size: smaller">');
      for (var j = 0; j < subTabs.length; j++) {
        if (j > 0) {
          document.write('&nbsp;|&nbsp;');
        }
        var subTab = subTabs[j][0];
        var subLink = subTabs[j][1];
        var subTarget = "";
        if (subTabs[j].length > 2) {
          subTarget = ' target="'+subTabs[j][2]+'"';
        }
        if (subLink == null) {
          document.write(subTab);
        } else {
          document.write('<a href="' + subLink + '"' + subTarget + '>' + subTab + '</a>');
        }
      }
      document.write('</span>');
    }
    document.write('</td>');
  }
  document.write('</tr></table>\n');
  document.write('</div></div>');
  document.write('<div id="wrapper-nav"><div id="leftcol"><div class="navigation">');

  // Now, recursively write out the tree.

  recursively_write_tree(dTree, 1);

  // Left navigation bar ends here

  document.write('</div><br/></div></div>');
}

// And now, the various trees.

function write_user_sidebar() {
  write_doc_frame(
                  //-- TITLE
                  'Geocoding with Oxygen',
                  //-- Sub-title
                  [['', null]],
                  // CHAPTERS
                  [
                   // Ch. 1,
                   ['Introduction', ['./OxygenUserManual.htm', 'Intro'] ],
                   // Ch. 2a, etc.
                   ['Desktop Geocoding', ['./oxygen_desktop.htm', 'Desktop']], 
                   // Ch. 2b, etc.
                   ['Name Search', ['./oxygen_search.htm', 'Search']], 
                   // Ch. 3, etc.
                   ['Geocoding in Depth', ['./oxygen_geocoding_detail.htm', 'InDepth']], 
                   // Ch. 4, etc.
                   ['Special Features', ['./oxygen_features.htm', 'Features']] 
                   
                   //--- end CHAPTERS--- 
                   ]
                  );
}

