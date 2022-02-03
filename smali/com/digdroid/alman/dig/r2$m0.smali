.class Lcom/digdroid/alman/dig/r2$m0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/r2;->z3(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/ArrayList;

.field final synthetic b:Landroid/database/Cursor;

.field final synthetic c:Landroid/database/sqlite/SQLiteDatabase;

.field final synthetic d:Lcom/digdroid/alman/dig/r2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/r2;Ljava/util/ArrayList;Landroid/database/Cursor;Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r2$m0;->d:Lcom/digdroid/alman/dig/r2;

    iput-object p2, p0, Lcom/digdroid/alman/dig/r2$m0;->a:Ljava/util/ArrayList;

    iput-object p3, p0, Lcom/digdroid/alman/dig/r2$m0;->b:Landroid/database/Cursor;

    iput-object p4, p0, Lcom/digdroid/alman/dig/r2$m0;->c:Landroid/database/sqlite/SQLiteDatabase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onShow(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$m0;->d:Lcom/digdroid/alman/dig/r2;

    iget-object p1, p1, Lcom/digdroid/alman/dig/r2;->r0:Landroidx/appcompat/app/b;

    const/4 v0, -0x1

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/b;->e(I)Landroid/widget/Button;

    move-result-object p1

    new-instance v0, Lcom/digdroid/alman/dig/r2$m0$a;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/r2$m0$a;-><init>(Lcom/digdroid/alman/dig/r2$m0;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$m0;->d:Lcom/digdroid/alman/dig/r2;

    iget-object p1, p1, Lcom/digdroid/alman/dig/r2;->r0:Landroidx/appcompat/app/b;

    const/4 v0, -0x2

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/b;->e(I)Landroid/widget/Button;

    move-result-object p1

    new-instance v0, Lcom/digdroid/alman/dig/r2$m0$b;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/r2$m0$b;-><init>(Lcom/digdroid/alman/dig/r2$m0;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$m0;->d:Lcom/digdroid/alman/dig/r2;

    iget-object p1, p1, Lcom/digdroid/alman/dig/r2;->r0:Landroidx/appcompat/app/b;

    const/4 v0, -0x3

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/b;->e(I)Landroid/widget/Button;

    move-result-object p1

    new-instance v0, Lcom/digdroid/alman/dig/r2$m0$c;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/r2$m0$c;-><init>(Lcom/digdroid/alman/dig/r2$m0;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
