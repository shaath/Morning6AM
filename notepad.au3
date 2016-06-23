Run("notepad.exe")

WinWaitActive("Untitled - Notepad")
ControlSend("Untitled - Notepad","","Edit1","Hi, Welcome to selenium world")