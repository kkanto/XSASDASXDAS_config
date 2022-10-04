 
listView('XSASDASXDAS Jobs') {
    description('XSASDASXDAS Jobs')
    jobs {
        regex('XSASDASXDAS_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
