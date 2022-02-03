.class public Lcom/digdroid/alman/dig/c3;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static a:Lcom/digdroid/alman/dig/c3;


# instance fields
.field private b:Landroid/content/SharedPreferences;

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:Z

.field public g:Z

.field private h:Z

.field private i:Z

.field public j:Ljava/lang/String;

.field private k:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/c3;->c:Z

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/c3;->d:Z

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/c3;->e:Z

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/c3;->f:Z

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/c3;->g:Z

    const-string v1, "default"

    iput-object v1, p0, Lcom/digdroid/alman/dig/c3;->j:Ljava/lang/String;

    iput-object p1, p0, Lcom/digdroid/alman/dig/c3;->k:Landroid/content/Context;

    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/c3;->b:Landroid/content/SharedPreferences;

    const-string p1, "read_announcement"

    const-wide/16 v1, 0x0

    invoke-virtual {p0, p1, v1, v2}, Lcom/digdroid/alman/dig/c3;->n(Ljava/lang/String;J)J

    move-result-wide v3

    const-string p1, "last_announcement"

    invoke-virtual {p0, p1, v1, v2}, Lcom/digdroid/alman/dig/c3;->n(Ljava/lang/String;J)J

    move-result-wide v1

    cmp-long p1, v3, v1

    if-gez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/digdroid/alman/dig/c3;->h:Z

    const-string p1, "kiosk_mode"

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/c3;->c(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/c3;->i:Z

    return-void
.end method

.method public static declared-synchronized k(Landroid/content/Context;)Lcom/digdroid/alman/dig/c3;
    .locals 2

    const-class v0, Lcom/digdroid/alman/dig/c3;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/digdroid/alman/dig/c3;->a:Lcom/digdroid/alman/dig/c3;

    if-nez v1, :cond_0

    new-instance v1, Lcom/digdroid/alman/dig/c3;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/c3;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/digdroid/alman/dig/c3;->a:Lcom/digdroid/alman/dig/c3;

    :cond_0
    sget-object p0, Lcom/digdroid/alman/dig/c3;->a:Lcom/digdroid/alman/dig/c3;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public A(Ljava/lang/String;Z)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/digdroid/alman/dig/c3;->B(Ljava/lang/String;Z)V

    return-void
.end method

.method public B(Ljava/lang/String;Z)V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/c3;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public C(J)V
    .locals 1

    const-string v0, "dirs_last_scanned"

    invoke-virtual {p0, v0, p1, p2}, Lcom/digdroid/alman/dig/c3;->F(Ljava/lang/String;J)V

    return-void
.end method

.method public D(Ljava/lang/String;F)V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/c3;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public E(Ljava/lang/String;I)V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/c3;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public F(Ljava/lang/String;J)V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/c3;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public G(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/c3;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public H(Ljava/lang/String;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/digdroid/alman/dig/c3;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public I(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/c3;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    :try_start_0
    invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public J(Ljava/lang/String;)V
    .locals 4

    invoke-static {p1}, Lcom/digdroid/alman/dig/a4;->t(Ljava/lang/String;)J

    move-result-wide v0

    const-string p1, "last_announcement"

    invoke-virtual {p0, p1, v0, v1}, Lcom/digdroid/alman/dig/c3;->F(Ljava/lang/String;J)V

    const-string p1, "read_announcement"

    const-wide/16 v2, 0x0

    invoke-virtual {p0, p1, v2, v3}, Lcom/digdroid/alman/dig/c3;->n(Ljava/lang/String;J)J

    move-result-wide v2

    cmp-long p1, v2, v0

    if-gez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/digdroid/alman/dig/c3;->h:Z

    return-void
.end method

.method public K(Z)V
    .locals 1

    const-string v0, "download_covers"

    invoke-virtual {p0, v0, p1}, Lcom/digdroid/alman/dig/c3;->B(Ljava/lang/String;Z)V

    return-void
.end method

.method public declared-synchronized L(Z)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-boolean p1, p0, Lcom/digdroid/alman/dig/c3;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public M(Ljava/lang/String;)V
    .locals 1

    const-string v0, "game_list_type"

    invoke-virtual {p0, v0, p1}, Lcom/digdroid/alman/dig/c3;->G(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public N(J)V
    .locals 1

    const-string v0, "game_start_t"

    invoke-virtual {p0, v0, p1, p2}, Lcom/digdroid/alman/dig/c3;->F(Ljava/lang/String;J)V

    return-void
.end method

.method public O(D)V
    .locals 0

    double-to-float p1, p1

    const-string p2, "game_block_size"

    invoke-virtual {p0, p2, p1}, Lcom/digdroid/alman/dig/c3;->D(Ljava/lang/String;F)V

    return-void
.end method

.method public P(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/c3;->f:Z

    return-void
.end method

.method public declared-synchronized Q(Z)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-boolean p1, p0, Lcom/digdroid/alman/dig/c3;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized R(Z)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "images_renamed"

    invoke-virtual {p0, v0, p1}, Lcom/digdroid/alman/dig/c3;->B(Ljava/lang/String;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public S(Z)V
    .locals 1

    const-string v0, "inform_scan"

    invoke-virtual {p0, v0, p1}, Lcom/digdroid/alman/dig/c3;->B(Ljava/lang/String;Z)V

    return-void
.end method

.method public T(Z)V
    .locals 1

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/c3;->i:Z

    const-string v0, "kiosk_mode"

    invoke-virtual {p0, v0, p1}, Lcom/digdroid/alman/dig/c3;->B(Ljava/lang/String;Z)V

    return-void
.end method

.method public U(Z)V
    .locals 1

    const-string v0, "launch_immediately"

    invoke-virtual {p0, v0, p1}, Lcom/digdroid/alman/dig/c3;->B(Ljava/lang/String;Z)V

    return-void
.end method

.method public declared-synchronized V(Z)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-boolean p1, p0, Lcom/digdroid/alman/dig/c3;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public W(Z)V
    .locals 1

    const-string v0, "show_all_systems"

    invoke-virtual {p0, v0, p1}, Lcom/digdroid/alman/dig/c3;->B(Ljava/lang/String;Z)V

    return-void
.end method

.method public X(D)V
    .locals 0

    double-to-float p1, p1

    const-string p2, "systems_block_size"

    invoke-virtual {p0, p2, p1}, Lcom/digdroid/alman/dig/c3;->D(Ljava/lang/String;F)V

    return-void
.end method

.method public Y()V
    .locals 3

    const-string v0, "last_announcement"

    const-wide/16 v1, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lcom/digdroid/alman/dig/c3;->n(Ljava/lang/String;J)J

    move-result-wide v0

    const-string v2, "read_announcement"

    invoke-virtual {p0, v2, v0, v1}, Lcom/digdroid/alman/dig/c3;->F(Ljava/lang/String;J)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/c3;->h:Z

    return-void
.end method

.method public Z()Z
    .locals 4

    iget-object v0, p0, Lcom/digdroid/alman/dig/c3;->k:Landroid/content/Context;

    invoke-static {v0}, Lcom/digdroid/alman/dig/h2;->b(Landroid/content/Context;)[Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/c3;->b:Landroid/content/SharedPreferences;

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    array-length v3, v0

    if-le v3, v2, :cond_0

    aget-object v0, v0, v2

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const-string v0, "use_sd_card"

    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public a()Z
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/c3;->b:Landroid/content/SharedPreferences;

    const-string v1, "download_covers"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/c3;->b:Landroid/content/SharedPreferences;

    const-string v1, "game_list_type"

    const-string v2, "grid"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;Z)Z
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/c3;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method public d()J
    .locals 4

    iget-object v0, p0, Lcom/digdroid/alman/dig/c3;->b:Landroid/content/SharedPreferences;

    const-string v1, "dirs_last_scanned"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public declared-synchronized e()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/digdroid/alman/dig/c3;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public f(Ljava/lang/String;F)F
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/c3;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result p1

    return p1
.end method

.method public g()Ljava/lang/Long;
    .locals 4

    iget-object v0, p0, Lcom/digdroid/alman/dig/c3;->b:Landroid/content/SharedPreferences;

    const-string v1, "game_start_t"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/c3;->f:Z

    return v0
.end method

.method public declared-synchronized i()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/digdroid/alman/dig/c3;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public j()Z
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/c3;->b:Landroid/content/SharedPreferences;

    const-string v1, "inform_scan"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public l(Ljava/lang/String;I)I
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/c3;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public m()Z
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/c3;->b:Landroid/content/SharedPreferences;

    const-string v1, "launch_immediately"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public n(Ljava/lang/String;J)J
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/c3;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1, p2, p3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public declared-synchronized o()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/digdroid/alman/dig/c3;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public p()Z
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/c3;->b:Landroid/content/SharedPreferences;

    const-string v1, "show_all_systems"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/c3;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public r(Ljava/lang/String;)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/digdroid/alman/dig/c3;->b:Landroid/content/SharedPreferences;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public declared-synchronized s()Z
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/c3;->b:Landroid/content/SharedPreferences;

    const-string v1, "images_renamed"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public t()Z
    .locals 1

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/c3;->i:Z

    return v0
.end method

.method public u()Z
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/c3;->k:Landroid/content/Context;

    const-string v1, "uimode"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/UiModeManager;

    invoke-virtual {v0}, Landroid/app/UiModeManager;->getCurrentModeType()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public v()Z
    .locals 1

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/c3;->h:Z

    return v0
.end method

.method public w(Ljava/lang/String;F)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/digdroid/alman/dig/c3;->D(Ljava/lang/String;F)V

    return-void
.end method

.method public x(Ljava/lang/String;I)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/digdroid/alman/dig/c3;->E(Ljava/lang/String;I)V

    return-void
.end method

.method public y(Ljava/lang/String;J)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/digdroid/alman/dig/c3;->F(Ljava/lang/String;J)V

    return-void
.end method

.method public z(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/digdroid/alman/dig/c3;->G(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
