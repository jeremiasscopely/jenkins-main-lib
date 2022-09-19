

class JobProperties {

    static String defaultJobDescription = ''''''

    static String playgroundFolder = "Playground"

    static private String nameWithoutFolders(String name) {
        return name.tokenize('/').last()
    }

    static String folder(String jobName) {

        // check if the job name contains a folder
        String folderName = ''
        if (jobName.contains('/')) {
            folderName=jobName.substring(0, jobName.lastIndexOf('/'))
        }

        if (CJenkins.getBooleanParameter('debug')) {
            String branch = CJenkins.getParameter('branch')

            if (folderName) {
                folderName = "/" + folderName
            }

            if (branch.contains('/')) {
                return playgroundFolder + "/" + nameWithoutFolders(branch) + folderName
            }
            return playgroundFolder + "/" + branch + folderName
        } else {
            return folderName
        }
    }

    static String postfix() {
        String postfix = ''
        if (CJenkins.getBooleanParameter('debug')) {
            postfix = '.dbg'
        }
        return postfix
    }

    static String name(String jobName) {
        if (CJenkins.getBooleanParameter('debug')) {
            String folderName = folder(jobName)
            if (jobName.contains('/')) {
                jobName = nameWithoutFolders(jobName)
            }
            return folderName + '/' + jobName + postfix()
        } else {
            return jobName
        }
    }

}
