.class Lcom/digdroid/alman/dig/s1$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/d0$s;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/s1;->E3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/database/Cursor;

.field final synthetic b:Lcom/digdroid/alman/dig/s1;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/s1;Landroid/database/Cursor;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/s1$d;->b:Lcom/digdroid/alman/dig/s1;

    iput-object p2, p0, Lcom/digdroid/alman/dig/s1$d;->a:Landroid/database/Cursor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/s1$d;->b:Lcom/digdroid/alman/dig/s1;

    iget-object v1, p0, Lcom/digdroid/alman/dig/s1$d;->a:Landroid/database/Cursor;

    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/digdroid/alman/dig/s1$d;->a:Landroid/database/Cursor;

    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v0, v1, v2}, Lcom/digdroid/alman/dig/s1;->D3(Lcom/digdroid/alman/dig/s1;Landroid/database/Cursor;I)V

    return-void
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/s1$d;->b:Lcom/digdroid/alman/dig/s1;

    iget-object v1, p0, Lcom/digdroid/alman/dig/s1$d;->a:Landroid/database/Cursor;

    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/digdroid/alman/dig/s1$d;->a:Landroid/database/Cursor;

    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v0, v1, v2}, Lcom/digdroid/alman/dig/s1;->D3(Lcom/digdroid/alman/dig/s1;Landroid/database/Cursor;I)V

    return-void
.end method
