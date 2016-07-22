package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,37);
if (RapidSub.canDelegate("activity_create")) return main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
RemoteObject _ruta = RemoteObject.createImmutable("");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 37;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="Activity.LoadLayout(\"Lform1\")";
Debug.ShouldStop(32);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Lform1")),main.mostCurrent.activityBA);
 BA.debugLineNum = 39;BA.debugLine="Dim ruta As String";
Debug.ShouldStop(64);
_ruta = RemoteObject.createImmutable("");Debug.locals.put("ruta", _ruta);
 BA.debugLineNum = 41;BA.debugLine="If File.ExternalWritable Then";
Debug.ShouldStop(256);
if (main.mostCurrent.__c.getField(false,"File").runMethod(true,"getExternalWritable").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 42;BA.debugLine="ruta=File.DirDefaultExternal";
Debug.ShouldStop(512);
_ruta = main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal");Debug.locals.put("ruta", _ruta);
 }else {
 BA.debugLineNum = 44;BA.debugLine="ruta=File.DirInternal";
Debug.ShouldStop(2048);
_ruta = main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal");Debug.locals.put("ruta", _ruta);
 };
 BA.debugLineNum = 47;BA.debugLine="If File.Exists(ruta,\"bdagenda.db\")= False Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",main.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_ruta),(Object)(RemoteObject.createImmutable("bdagenda.db"))),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 48;BA.debugLine="File.Copy(File.DirAssets, \"dbagenda.db\", ruta, \"";
Debug.ShouldStop(32768);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("dbagenda.db")),(Object)(_ruta),(Object)(RemoteObject.createImmutable("dbagenda.db")));
 };
 BA.debugLineNum = 52;BA.debugLine="s.Initialize(ruta,\"dbagenda.db\",True)";
Debug.ShouldStop(524288);
main._s.runVoidMethod ("Initialize",(Object)(_ruta),(Object)(BA.ObjectToString("dbagenda.db")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,60);
if (RapidSub.canDelegate("activity_pause")) return main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 60;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,57);
if (RapidSub.canDelegate("activity_resume")) return main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 57;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnagrega_click() throws Exception{
try {
		Debug.PushSubsStack("btnAgrega_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,65);
if (RapidSub.canDelegate("btnagrega_click")) return main.remoteMe.runUserSub(false, "main","btnagrega_click");
int _i = 0;
 BA.debugLineNum = 65;BA.debugLine="Sub btnAgrega_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 67;BA.debugLine="v = \"jejeje\"";
Debug.ShouldStop(4);
main._v = BA.ObjectToString("jejeje");
 BA.debugLineNum = 68;BA.debugLine="If txtnom.Text<> \"\"+v And txttel.Text <> \"\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("!",main.mostCurrent._txtnom.runMethod(true,"getText"),BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, ""),BA.numberCast(double.class, main._v)}, "+",1, 0))) && RemoteObject.solveBoolean("!",main.mostCurrent._txttel.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 70;BA.debugLine="s.ExecNonQuery2(\"INSERT INTO Contactos (Nombre,T";
Debug.ShouldStop(32);
main._s.runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("INSERT INTO Contactos (Nombre,Telefono) VALUES(?,?)")),(Object)(main.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {main.mostCurrent._txtnom.runMethod(true,"getText"),main.mostCurrent._txttel.runMethod(true,"getText")})))));
 BA.debugLineNum = 72;BA.debugLine="c=s.ExecQuery(\"SELECT Nombre, Telefono FROM Cont";
Debug.ShouldStop(128);
main._c.setObject(main._s.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT Nombre, Telefono FROM Contactos"))));
 BA.debugLineNum = 74;BA.debugLine="LvlisContac.Clear";
Debug.ShouldStop(512);
main.mostCurrent._lvliscontac.runVoidMethod ("Clear");
 BA.debugLineNum = 76;BA.debugLine="If c.RowCount>0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",main._c.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 77;BA.debugLine="For i=0 To c.RowCount-1";
Debug.ShouldStop(4096);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {main._c.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7); _i = ((int)(0 + _i + step7)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 78;BA.debugLine="c.Position=i";
Debug.ShouldStop(8192);
main._c.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 80;BA.debugLine="LvlisContac.AddTwoLines(c.GetString(\"Nombre\"),";
Debug.ShouldStop(32768);
main.mostCurrent._lvliscontac.runVoidMethod ("AddTwoLines",(Object)(main._c.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Nombre")))),(Object)(main._c.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Telefono")))));
 }
}Debug.locals.put("i", _i);
;
 };
 };
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 29;BA.debugLine="Private txtnom As EditText";
main.mostCurrent._txtnom = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private txttel As EditText";
main.mostCurrent._txttel = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private LvlisContac As ListView";
main.mostCurrent._lvliscontac = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private btnAgrega As Button";
main.mostCurrent._btnagrega = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 19;BA.debugLine="Dim s As SQL";
main._s = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 20;BA.debugLine="Dim c As Cursor";
main._c = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Dim v As String";
main._v = RemoteObject.createImmutable("");
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}