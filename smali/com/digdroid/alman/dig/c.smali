.class public Lcom/digdroid/alman/dig/c;
.super Lcom/digdroid/alman/dig/p1;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/c$d;
    }
.end annotation


# instance fields
.field n0:Lcom/digdroid/alman/dig/MyListView;

.field o0:Lorg/json/JSONArray;

.field p0:Lcom/digdroid/alman/dig/c$d;

.field q0:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/p1;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic B2()Z
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->B2()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic C2()Z
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->C2()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic E2(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->E2(Z)V

    return-void
.end method

.method public bridge synthetic F2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->F2()V

    return-void
.end method

.method public bridge synthetic G2(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->G2(Z)V

    return-void
.end method

.method public bridge synthetic I2(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->I2(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic J2(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->J2(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic K2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->K2()V

    return-void
.end method

.method public bridge synthetic N2()Z
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->N2()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic P2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->P2()V

    return-void
.end method

.method public bridge synthetic Q2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->Q2()V

    return-void
.end method

.method public bridge synthetic R2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->R2()V

    return-void
.end method

.method public bridge synthetic S2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->S2()V

    return-void
.end method

.method public bridge synthetic T0(Landroid/content/Context;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->T0(Landroid/content/Context;)V

    return-void
.end method

.method public bridge synthetic T2(Lcom/digdroid/alman/dig/h0;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->T2(Lcom/digdroid/alman/dig/h0;)V

    return-void
.end method

.method public bridge synthetic U2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->U2()V

    return-void
.end method

.method public W0(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->W0(Landroid/os/Bundle;)V

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "announcements"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/digdroid/alman/dig/c;->q0:Ljava/lang/String;

    return-void
.end method

.method public bridge synthetic W2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->W2()V

    return-void
.end method

.method public bridge synthetic X2(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->X2(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic Y2(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->Y2(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic Z0(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/digdroid/alman/dig/p1;->Z0(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    return-void
.end method

.method public a1(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const p3, 0x7f0c002b

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f090067

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/digdroid/alman/dig/MyListView;

    iput-object p2, p0, Lcom/digdroid/alman/dig/c;->n0:Lcom/digdroid/alman/dig/MyListView;

    new-instance p3, Landroid/graphics/drawable/ColorDrawable;

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    iget v0, v0, Lcom/digdroid/alman/dig/s3;->e:I

    const v1, 0x40ffffff

    and-int/2addr v0, v1

    invoke-direct {p3, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p2, p3}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    iget-object p2, p0, Lcom/digdroid/alman/dig/c;->n0:Lcom/digdroid/alman/dig/MyListView;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/content/Context;

    move-result-object p3

    const/high16 v0, 0x3fc00000    # 1.5f

    invoke-static {p3, v0}, Lcom/digdroid/alman/dig/z3;->d(Landroid/content/Context;F)I

    move-result p3

    invoke-virtual {p2, p3}, Landroid/widget/ListView;->setDividerHeight(I)V

    iget-object p2, p0, Lcom/digdroid/alman/dig/c;->n0:Lcom/digdroid/alman/dig/MyListView;

    new-instance p3, Lcom/digdroid/alman/dig/c$a;

    invoke-direct {p3, p0}, Lcom/digdroid/alman/dig/c$a;-><init>(Lcom/digdroid/alman/dig/c;)V

    invoke-virtual {p2, p3}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    return-object p1
.end method

.method public bridge synthetic a3(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->a3(Z)V

    return-void
.end method

.method public bridge synthetic c3()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->c3()V

    return-void
.end method

.method public bridge synthetic d3()Z
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->d3()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic e3()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->e3()V

    return-void
.end method

.method g3(Ljava/lang/String;)V
    .locals 3

    const-string v0, "announcements"

    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iput-object p1, p0, Lcom/digdroid/alman/dig/c;->q0:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/c;->o0:Lorg/json/JSONArray;

    new-instance p1, Lcom/digdroid/alman/dig/c$d;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/c;->o0:Lorg/json/JSONArray;

    invoke-direct {p1, p0, v0, v1}, Lcom/digdroid/alman/dig/c$d;-><init>(Lcom/digdroid/alman/dig/c;Landroid/content/Context;Lorg/json/JSONArray;)V

    iput-object p1, p0, Lcom/digdroid/alman/dig/c;->p0:Lcom/digdroid/alman/dig/c$d;

    iget-object v0, p0, Lcom/digdroid/alman/dig/c;->n0:Lcom/digdroid/alman/dig/MyListView;

    invoke-virtual {v0, p1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public bridge synthetic k1(Landroid/view/MenuItem;)Z
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->k1(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic m1()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->m1()V

    return-void
.end method

.method public bridge synthetic q2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->q2()V

    return-void
.end method

.method public r1()V
    .locals 4

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->r1()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/b3;->v()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/digdroid/alman/dig/c;->q0:Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/b3;->Y()V

    const v0, 0x7f110029

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->D0(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/c;->X2(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/c;->q0:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/c;->g3(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/digdroid/alman/dig/ServerService;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/announcements.txt"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lc/a/c/w/n;

    new-instance v2, Lcom/digdroid/alman/dig/c$b;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/c$b;-><init>(Lcom/digdroid/alman/dig/c;)V

    new-instance v3, Lcom/digdroid/alman/dig/c$c;

    invoke-direct {v3, p0}, Lcom/digdroid/alman/dig/c$c;-><init>(Lcom/digdroid/alman/dig/c;)V

    invoke-direct {v1, v0, v2, v3}, Lc/a/c/w/n;-><init>(Ljava/lang/String;Lc/a/c/p$b;Lc/a/c/p$a;)V

    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    invoke-static {v0}, Lcom/digdroid/alman/dig/l2;->a(Landroid/content/Context;)Lc/a/c/o;

    move-result-object v0

    invoke-virtual {v0, v1}, Lc/a/c/o;->a(Lc/a/c/n;)Lc/a/c/n;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_0
    return-void
.end method

.method public s1(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/c;->q0:Ljava/lang/String;

    const-string v1, "announcements"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->s1(Landroid/os/Bundle;)V

    return-void
.end method

.method public bridge synthetic s2()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->s2()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic t1()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->t1()V

    return-void
.end method

.method public t2()Ljava/lang/String;
    .locals 1

    const-string v0, "announcements"

    return-object v0
.end method

.method public bridge synthetic u2()J
    .locals 2

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->u2()J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic v2()Lcom/digdroid/alman/dig/s3;
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->v2()Lcom/digdroid/alman/dig/s3;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic x2()Z
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->x2()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic y2(II)Z
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/digdroid/alman/dig/p1;->y2(II)Z

    move-result p1

    return p1
.end method
