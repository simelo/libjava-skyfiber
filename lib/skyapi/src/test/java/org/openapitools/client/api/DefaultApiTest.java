/*
 * Skycoin REST API.
 * Skycoin is a next-generation cryptocurrency.
 *
 * OpenAPI spec version: 0.25.1
 * Contact: skycoin.doe@example.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.InlineObject;
import org.openapitools.client.model.InlineResponse200;
import org.openapitools.client.model.InlineResponse2001;
import org.openapitools.client.model.InlineResponse2002;
import org.openapitools.client.model.InlineResponse2003;
import org.openapitools.client.model.InlineResponse2004;
import org.openapitools.client.model.InlineResponse2005;
import org.openapitools.client.model.InlineResponse2006;
import org.openapitools.client.model.InlineResponse2007;
import org.openapitools.client.model.InlineResponseDefault;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * Returns the total number of unique address that have coins.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addressCountTest() throws ApiException {
        Object response = api.addressCount();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the historical, spent outputs associated with an address
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addressUxoutsTest() throws ApiException {
        String address = null;
        List<InlineResponse200> response = api.addressUxouts(address);

        // TODO: test validations
    }
    
    /**
     * Returns the balance of one or more addresses, both confirmed and predicted. The predicted balance is the confirmed balance minus the pending spends.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void balanceGetTest() throws ApiException {
        String addrs = null;
        Object response = api.balanceGet(addrs);

        // TODO: test validations
    }
    
    /**
     * Returns the balance of one or more addresses, both confirmed and predicted. The predicted balance is the confirmed balance minus the pending spends.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void balancePostTest() throws ApiException {
        String addrs = null;
        Object response = api.balancePost(addrs);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a block by hash or seq. Note: only one of hash or seq is allowed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void blockTest() throws ApiException {
        String hash = null;
        Integer seq = null;
        Object response = api.block(hash, seq);

        // TODO: test validations
    }
    
    /**
     * Returns the blockchain metadata.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void blockchainMetadataTest() throws ApiException {
        Object response = api.blockchainMetadata();

        // TODO: test validations
    }
    
    /**
     * Returns the blockchain sync progress.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void blockchainProgressTest() throws ApiException {
        Object response = api.blockchainProgress();

        // TODO: test validations
    }
    
    /**
     * blocksHandler returns blocks between a start and end point,
     *
     * or an explicit list of sequences. If using start and end, the block sequences include both the start and end point. Explicit sequences cannot be combined with start and end. Without verbose.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void blocksGetTest() throws ApiException {
        Integer start = null;
        Integer end = null;
        List<Integer> seqs = null;
        Object response = api.blocksGet(start, end, seqs);

        // TODO: test validations
    }
    
    /**
     * blocksHandler returns blocks between a start and end point,
     *
     * or an explicit list of sequences. If using start and end, the block sequences include both the start and end point. Explicit sequences cannot be combined with start and end. Without verbose
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void blocksPostTest() throws ApiException {
        Integer start = null;
        Integer end = null;
        List<Integer> seqs = null;
        Object response = api.blocksPost(start, end, seqs);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * coinSupplyHandler returns coin distribution supply stats
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void coinSupplyTest() throws ApiException {
        api.coinSupply();

        // TODO: test validations
    }
    
    /**
     * Creates a new CSRF token. Previous CSRF tokens are invalidated by this call.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void csrfTest() throws ApiException {
        InlineResponse2001 response = api.csrf();

        // TODO: test validations
    }
    
    /**
     * defaultConnectionsHandler returns the list of default hardcoded bootstrap addresses.\\n They are not necessarily connected to.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void defaultConnectionsTest() throws ApiException {
        List<String> response = api.defaultConnections();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns all transactions (confirmed and unconfirmed) for an address
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void explorerAddressTest() throws ApiException {
        String address = null;
        List<InlineResponse2002> response = api.explorerAddress(address);

        // TODO: test validations
    }
    
    /**
     * Returns node health data.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void healthTest() throws ApiException {
        Object response = api.health();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the most recent N blocks on the blockchain
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void lastBlocksTest() throws ApiException {
        Integer num = null;
        Object response = api.lastBlocks(num);

        // TODO: test validations
    }
    
    /**
     * This endpoint returns a specific connection.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void networkConnectionTest() throws ApiException {
        String addr = null;
        InlineResponse2003 response = api.networkConnection(addr);

        // TODO: test validations
    }
    
    /**
     * This endpoint returns all outgoings connections.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void networkConnectionsTest() throws ApiException {
        String states = null;
        String direction = null;
        List<InlineResponse2003> response = api.networkConnections(states, direction);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * This endpoint disconnects a connection by ID or address
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void networkConnectionsDisconnectTest() throws ApiException {
        String id = null;
        api.networkConnectionsDisconnect(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * This endpoint returns all connections found through peer exchange
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void networkConnectionsExchangeTest() throws ApiException {
        List<String> response = api.networkConnectionsExchange();

        // TODO: test validations
    }
    
    /**
     * trustConnectionsHandler returns all trusted connections.\\n They are not necessarily connected to. In the default configuration, these will be a subset of the default hardcoded bootstrap addresses.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void networkConnectionsTrustTest() throws ApiException {
        List<String> response = api.networkConnectionsTrust();

        // TODO: test validations
    }
    
    /**
     * If neither addrs nor hashes are specificed, return all unspent outputs. If only one filter is specified, then return outputs match the filter. Both filters cannot be specified.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void outputsGetTest() throws ApiException {
        List<String> address = null;
        List<String> hash = null;
        Object response = api.outputsGet(address, hash);

        // TODO: test validations
    }
    
    /**
     * If neither addrs nor hashes are specificed, return all unspent outputs. If only one filter is specified, then return outputs match the filter. Both filters cannot be specified.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void outputsPostTest() throws ApiException {
        String address = null;
        String hash = null;
        Object response = api.outputsPost(address, hash);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns pending (unconfirmed) transactions without verbose
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pendingTxsTest() throws ApiException {
        List<InlineResponse2004> response = api.pendingTxs();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Broadcasts all unconfirmed transactions from the unconfirmed transaction pool
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resendUnconfirmedTxnsTest() throws ApiException {
        api.resendUnconfirmedTxns();

        // TODO: test validations
    }
    
    /**
     * Returns the top skycoin holders.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void richlistTest() throws ApiException {
        Boolean includeDistribution = null;
        String n = null;
        Object response = api.richlist(includeDistribution, n);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a transaction identified by its txid hash with just id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transactionTest() throws ApiException {
        String txid = null;
        Boolean encoded = null;
        Object response = api.transaction(txid, encoded);

        // TODO: test validations
    }
    
    /**
     * Broadcast a hex-encoded, serialized transaction to the network.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transactionInjectTest() throws ApiException {
        String rawtx = null;
        Object response = api.transactionInject(rawtx);

        // TODO: test validations
    }
    
    /**
     * Returns the hex-encoded byte serialization of a transaction. The transaction may be confirmed or unconfirmed.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transactionRawTest() throws ApiException {
        String txid = null;
        Object response = api.transactionRaw(txid);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Decode and verify an encoded transaction
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transactionVerifyTest() throws ApiException {
        Object response = api.transactionVerify();

        // TODO: test validations
    }
    
    /**
     * Returns transactions that match the filters.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transactionsGetTest() throws ApiException {
        String addrs = null;
        String confirmed = null;
        Object response = api.transactionsGet(addrs, confirmed);

        // TODO: test validations
    }
    
    /**
     * Returns transactions that match the filters.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transactionsPostTest() throws ApiException {
        String addrs = null;
        String confirmed = null;
        Object response = api.transactionsPost(addrs, confirmed);

        // TODO: test validations
    }
    
    /**
     * Returns an unspent output by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uxoutTest() throws ApiException {
        String uxid = null;
        Object response = api.uxout(uxid);

        // TODO: test validations
    }
    
    /**
     * Verifies a Skycoin address.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void verifyAddressTest() throws ApiException {
        String address = null;
        InlineResponse2007 response = api.verifyAddress(address);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * versionHandler returns the application version info
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void versionTest() throws ApiException {
        api.version();

        // TODO: test validations
    }
    
    /**
     * Returns a wallet by id.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void walletTest() throws ApiException {
        String id = null;
        Object response = api.wallet(id);

        // TODO: test validations
    }
    
    /**
     * Returns the wallet&#39;s balance, both confirmed and predicted.  The predicted balance is the confirmed balance minus the pending spends.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void walletBalanceTest() throws ApiException {
        String id = null;
        Object response = api.walletBalance(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Loads wallet from seed, will scan ahead N address and load addresses till the last one that have coins.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void walletCreateTest() throws ApiException {
        String seed = null;
        String label = null;
        Integer scan = null;
        Boolean encrypt = null;
        String password = null;
        Object response = api.walletCreate(seed, label, scan, encrypt, password);

        // TODO: test validations
    }
    
    /**
     * Decrypts wallet.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void walletDecryptTest() throws ApiException {
        String id = null;
        String password = null;
        Object response = api.walletDecrypt(id, password);

        // TODO: test validations
    }
    
    /**
     * Encrypt wallet.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void walletEncryptTest() throws ApiException {
        String id = null;
        String password = null;
        Object response = api.walletEncrypt(id, password);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the wallet directory path
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void walletFolderTest() throws ApiException {
        String addr = null;
        InlineResponse2006 response = api.walletFolder(addr);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Generates new addresses
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void walletNewAddressTest() throws ApiException {
        String id = null;
        String num = null;
        String password = null;
        Object response = api.walletNewAddress(id, num, password);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the wallet directory path
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void walletNewSeedTest() throws ApiException {
        String entropy = null;
        Object response = api.walletNewSeed(entropy);

        // TODO: test validations
    }
    
    /**
     * Recovers an encrypted wallet by providing the seed. The first address will be generated from seed and compared to the first address of the specified wallet. If they match, the wallet will be regenerated with an optional password. If the wallet is not encrypted, an error is returned.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void walletRecoverTest() throws ApiException {
        String id = null;
        String seed = null;
        String password = null;
        Object response = api.walletRecover(id, seed, password);

        // TODO: test validations
    }
    
    /**
     * This endpoint only works for encrypted wallets. If the wallet is unencrypted, The seed will be not returned.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void walletSeedTest() throws ApiException {
        String id = null;
        String password = null;
        Object response = api.walletSeed(id, password);

        // TODO: test validations
    }
    
    /**
     * Verifies a wallet seed.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void walletSeedVerifyTest() throws ApiException {
        String seed = null;
        Object response = api.walletSeedVerify(seed);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Creates and broadcasts a transaction sending money from one of our wallets to destination address.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void walletSpentTest() throws ApiException {
        String id = null;
        String dst = null;
        String coins = null;
        String password = null;
        Object response = api.walletSpent(id, dst, coins, password);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Creates a signed transaction
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void walletTransactionTest() throws ApiException {
        InlineObject inlineObject = null;
        Object response = api.walletTransaction(inlineObject);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns returns all unconfirmed transactions for all addresses in a given wallet verbose
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void walletTransactionsTest() throws ApiException {
        String id = null;
        Object response = api.walletTransactions(id);

        // TODO: test validations
    }
    
    /**
     * Unloads wallet from the wallet service.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void walletUnloadTest() throws ApiException {
        String id = null;
        api.walletUnload(id);

        // TODO: test validations
    }
    
    /**
     * Update the wallet.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void walletUpdateTest() throws ApiException {
        String id = null;
        String label = null;
        api.walletUpdate(id, label);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns all loaded wallets
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void walletsTest() throws ApiException {
        List<InlineResponse2005> response = api.wallets();

        // TODO: test validations
    }
    
}