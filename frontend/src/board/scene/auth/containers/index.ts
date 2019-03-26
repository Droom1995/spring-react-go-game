import { bindActionCreators, Dispatch } from 'redux';
import { connect } from 'react-redux';
import {loginUser} from './../actions';
import InputBlock from '../../../components/common/Pit';

const mapStateToProps = (state, props) => ({
    buttonText: 'Login',
    inputPlaceholder: 'Name'
});

const mapDispatchToProps = (dispatch: Dispatch) => ({
    ...bindActionCreators({
        onSubmit: loginUser
    }, dispatch)
});

export default connect(mapStateToProps, mapDispatchToProps)(InputBlock);
