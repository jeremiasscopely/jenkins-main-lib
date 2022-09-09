

class Jenkins {

    static String getParameter(String name) {
        try {
            // get current thread / Executor
            def thr = Thread.currentThread()
            // get current build
            def build = thr?.executable
            return build.environment.get(name)
        }
        catch(Exception ex) {
            //Catch block
            return('')
        }
    }

    static Boolean getBooleanParameter(String name) {
        String value = getParameter(name)
        return (value == 'true')
    }

    // Detects if jobdsl is running as a test or in a real Jenkins
    static Boolean testMode() {
        def thr = Thread.currentThread()
        return thr.name.contains("JobScriptsSpec")
    }
}
