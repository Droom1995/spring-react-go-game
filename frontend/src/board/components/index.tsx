import * as React from 'react';
import { WithStyles, withStyles } from '@material-ui/core/styles';
import {styles} from './styles';
import { User } from '../scene/auth/state';
import { Message } from '../state';
import Pit
    from './common/Pit';
import AuthBlock from './../scene/auth/containers';

interface ChatProps {
    user: User;
    messages: Array<Message>;
    sendMessage: (message: Message) => void;
    subscribeOnMessages: any;
    getAllMessages: any;
}

// TODO move the message block to a separate component
const Board = (props: ChatProps & WithStyles<any>) => {
    React.useEffect(() => {
        props.subscribeOnMessages();
    }, [props.user])

    let sendMessage = (text: string) => props.sendMessage({
        text,
        date: new Date(),
        owner: {id: props.user.id}
    } as Message)

    return (
        <div className={props.classes.container}>
            </div>
            {
                !props.user
                ? null : <AuthBlock />
            }
        </div>
    )
};
  
export default withStyles(styles)(Board);
