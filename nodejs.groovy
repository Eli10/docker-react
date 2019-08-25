job('react-docker') {

  scm {
      git('https://github.com/Eli10/docker-react.git') { node ->

        node / gitConfigName('DSL User')
        node / gitConfigEmail('eaugustine@securityscorecard.io')

      }
  }

  triggers {
    scm('H/5 * * * *')
  }

  wrappers {
    nodejs('nodejs') // name of the NodeJS installation in
                    // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
  }

  steps {
    shell("npm install")
  }


}
