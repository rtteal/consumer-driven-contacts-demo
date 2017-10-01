package contracts.demo

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    name 'DemoTest'

    request {
        method GET()
        urlPath '/api/demo'
    }

    response {
        status 200
        body(
                time: 1505276760077L
        )
    }
}