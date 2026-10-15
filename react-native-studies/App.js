// import { StatusBar } from 'expo-status-bar';
import React, { useState } from 'react';
import {
  StyleSheet,
  Text,
  View,
  SafeAreaView,
  Dimensions,
  Platform,
  StatusBar,
  Image,
  TouchableWithoutFeedback,
  TouchableHighlight,
  TouchableOpacity,
  ScrollView,
  Button
} from 'react-native';

export default function App() {
  
  const [data, setData] = useState([""]);

  const [visible, setVisible] = useState(false);

  const catchEvent = message => {
    console.log(message);
  }

  const toggleView = () => {
    setVisible(!visible);
  }

  const ScrollViewText = ({row}) => {
    return (
      <Text style = {styles.scrollText}>
        {row}
      </Text>
    )
  }

  const addLine = () =>{
    let dat = data;
    setData([...data, `${dat.length + 1}`]);
  }
  
  return (
    <SafeAreaView style = {styles.container}>
      <View style={styles.header}>
        <Text style = {styles.logo}>App Logo</Text>
        <View style={styles.menu}>
          <TouchableWithoutFeedback
            onPress = {() => catchEvent("onPress")}
            onPressIn = {() => catchEvent("onPressIn")}
            onPressOut = {() => catchEvent("onPressOut")}
            hitSlop = {{
              left : 5,
              right : 5
            }}
            pressRetentionOffset = {{
              bottom : 50
            }}
            onLongPress = {() => catchEvent("onLongPress")}
          >
            <Image
              source = {require('./assets/menu_white.png')}
            />
          </TouchableWithoutFeedback>
          <TouchableHighlight
            onPress = {() => catchEvent("onPress")}
            onLongPress = {() => catchEvent("onLongPress")}
            activeOpacity = {0.8}
            onShowUnderlay = {() => catchEvent("onShowUnderlay")}
            onHideUnderlay = {() => catchEvent("onHideUnderlay")}
            underlayColor = {"orange"}
          >
            <Image
              source = {require('./assets/menu_white.png')}
            />
          </TouchableHighlight>
          <TouchableOpacity
            onPress = {() => catchEvent("onPress")}
            onLongPress = {() => catchEvent("onLongPress")}
            activeOpacity = {0}
          >
            <Image
              source = {require('./assets/menu_white.png')}
            />
          </TouchableOpacity>
        </View>
      </View>
      <View style={styles.main}>
        <TouchableHighlight onPress = {toggleView}>
          <View style = {styles.button}>
            <Text style = {styles.buttonText}>{visible ? "Gizle" : "Göster"}</Text>
          </View>
        </TouchableHighlight>
        <View style = {{ display : visible ? "flex" : "none", flex : 9}}>
          <Button title = "Satır Ekle" onPress = {addLine}/>
          <ScrollView onContentSizeChange = {() => console.log("içerik değişti")}>
            {
              data.map((_, index) =>(
                <ScrollViewText row = {index + 1} key = {index}/>
              ))
            }
            
          </ScrollView>
        </View>
      </View>
      <View style={styles.footer}>
        <Text style = {styles.footerContent}>Footer</Text>
      </View>
    </SafeAreaView>
  );
}

const {width, height} = Dimensions.get('window');

const styles = StyleSheet.create({
  
  container: {
    flex : 1,
    flexDirection : "column"
  },

  /**
   * Header Styles
   */
  header : {
    height : 50,
    backgroundColor : 'rgb(0, 38, 49)',
    flexDirection : "row",
    justifyContent : "space-between",
    alignItems : "center",
    marginTop: Platform.OS === "android" ? StatusBar.currentHeight : 0

  },
  logo: {
    flex : 2,
    textAlign : "center",
    fontSize : 18,
    fontWeight : "bold",
    color : "white"

  },
  menu : {
    flex : 4,
    height : 50,
    flexDirection : "row",
    justifyContent : "space-evenly",
    alignItems : "flex-end",
    paddingRight : 20
  },
  menuContent : {
    color : "#fff"
  },

  /**
   * Main Content Styles
   */

  main : {
    backgroundColor : '#fff',
    flex : 1,
    justifyContent : "flex-start",
    alignItems : "center"
  },

  button : {
    width : 125,
    height : 50,
    backgroundColor : "orange",
    justifyContent : "center",
    alignItems : "center",
  },

  buttonText : {
    color : "white",
  },

  scrollText : {
    width : 200,
    height : 50,
    color : "white",
    backgroundColor : "rgb(0, 38, 49)",
    textAlign : "center",
    lineHeight : 40,
    borderBottomColor : "white",
    borderStyle : "solid",
    borderWidth : 2
  },

  /**
   * Footer Styles
   */

  footer : {
    height : 80,
    justifyContent : "center",
    alignItems : "center",
    backgroundColor : 'rgb(0, 38, 49)'
  },
  footerContent : {
    color : "#fff"
  }
});
