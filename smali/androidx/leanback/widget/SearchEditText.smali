.class public Landroidx/leanback/widget/SearchEditText;
.super Landroidx/leanback/widget/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/leanback/widget/SearchEditText$a;
    }
.end annotation


# static fields
.field private static final i:Ljava/lang/String;


# instance fields
.field private j:Landroidx/leanback/widget/SearchEditText$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Landroidx/leanback/widget/SearchEditText;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/leanback/widget/SearchEditText;->i:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    sget v0, Lb/l/k;->a:I

    invoke-direct {p0, p1, p2, v0}, Landroidx/leanback/widget/SearchEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/leanback/widget/w;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic e()V
    .locals 0

    invoke-super {p0}, Landroidx/leanback/widget/w;->e()V

    return-void
.end method

.method public bridge synthetic g(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroidx/leanback/widget/w;->g(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/leanback/widget/w;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    return-void
.end method

.method public onKeyPreIme(ILandroid/view/KeyEvent;)Z
    .locals 2

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    iget-object p1, p0, Landroidx/leanback/widget/SearchEditText;->j:Landroidx/leanback/widget/SearchEditText$a;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroidx/leanback/widget/SearchEditText$a;->a()V

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-super {p0, p1, p2}, Landroid/widget/EditText;->onKeyPreIme(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/leanback/widget/w;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    return-void
.end method

.method public bridge synthetic setFinalRecognizedText(Ljava/lang/CharSequence;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/leanback/widget/w;->setFinalRecognizedText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setOnKeyboardDismissListener(Landroidx/leanback/widget/SearchEditText$a;)V
    .locals 0

    iput-object p1, p0, Landroidx/leanback/widget/SearchEditText;->j:Landroidx/leanback/widget/SearchEditText$a;

    return-void
.end method
