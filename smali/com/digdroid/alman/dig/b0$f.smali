.class Lcom/digdroid/alman/dig/b0$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/b0;->x(Lcom/digdroid/alman/dig/y3;JLjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/y3;

.field final synthetic c:Landroid/database/Cursor;

.field final synthetic d:Landroid/database/Cursor;

.field final synthetic e:Ljava/util/ArrayList;

.field final synthetic f:Lcom/digdroid/alman/dig/b0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/b0;Lcom/digdroid/alman/dig/y3;Landroid/database/Cursor;Landroid/database/Cursor;Ljava/util/ArrayList;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/b0$f;->f:Lcom/digdroid/alman/dig/b0;

    iput-object p2, p0, Lcom/digdroid/alman/dig/b0$f;->b:Lcom/digdroid/alman/dig/y3;

    iput-object p3, p0, Lcom/digdroid/alman/dig/b0$f;->c:Landroid/database/Cursor;

    iput-object p4, p0, Lcom/digdroid/alman/dig/b0$f;->d:Landroid/database/Cursor;

    iput-object p5, p0, Lcom/digdroid/alman/dig/b0$f;->e:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    iget-object p1, p0, Lcom/digdroid/alman/dig/b0$f;->f:Lcom/digdroid/alman/dig/b0;

    iget-object v0, p0, Lcom/digdroid/alman/dig/b0$f;->b:Lcom/digdroid/alman/dig/y3;

    iget-object v1, p0, Lcom/digdroid/alman/dig/b0$f;->c:Landroid/database/Cursor;

    iget-object v2, p0, Lcom/digdroid/alman/dig/b0$f;->d:Landroid/database/Cursor;

    iget-object v3, p0, Lcom/digdroid/alman/dig/b0$f;->e:Ljava/util/ArrayList;

    invoke-virtual {v3, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/io/File;

    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v0, v1, v2, p2}, Lcom/digdroid/alman/dig/b0;->u(Lcom/digdroid/alman/dig/y3;Landroid/database/Cursor;Landroid/database/Cursor;Ljava/lang/String;)V

    return-void
.end method
